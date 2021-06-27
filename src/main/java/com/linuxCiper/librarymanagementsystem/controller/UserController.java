package com.linuxCiper.librarymanagementsystem.controller;

import com.linuxCiper.librarymanagementsystem.dto.UserDTO;
import com.linuxCiper.librarymanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }

    @GetMapping
    public List<UserDTO> getAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable int id){
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){

        userService.deleteUser(id);
        return "User with id: "+id+" deleted!";
    }

    @PutMapping
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @GetMapping("/login")
    public UserDTO login(@RequestParam String username, @RequestParam String password) {
        return userService.login(username, password);
    }
}
