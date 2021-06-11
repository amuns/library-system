package com.linuxCiper.librarymanagementsystem.service.impl;

import com.linuxCiper.librarymanagementsystem.dto.UserDTO;
import com.linuxCiper.librarymanagementsystem.model.User;
import com.linuxCiper.librarymanagementsystem.repository.UserRepository;
import com.linuxCiper.librarymanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
//@RestController
//@Repository
//@Component
//@Configuration
public class UserServiceImpl implements UserService {
    @Autowired //Dependency Injection
    private UserRepository userRepository;


    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User user=new User(userDTO); //copy UserDTO to user
        User savedUser = userRepository.save(user); //save user to database
        UserDTO savedUserDTO = new UserDTO(savedUser); //copy user to UserDTO
        return savedUserDTO;
    }

    @Override
    public UserDTO findById(int id) {
        return null;
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users=userRepository.findAll();
        //List<UserDTO> userDTOs=users.stream().map(UserDTO::new).collect(Collectors.toList());
        List<UserDTO> userDTOs=new ArrayList<>();
        for (User user:users) {
            UserDTO userDTO=new UserDTO(user);
            userDTOs.add(userDTO);
        }
        return userDTOs;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
