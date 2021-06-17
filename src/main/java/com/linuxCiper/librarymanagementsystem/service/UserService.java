package com.linuxCiper.librarymanagementsystem.service;

import com.linuxCiper.librarymanagementsystem.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO addUser(UserDTO userDTO);
    UserDTO login(String username, String password);
    UserDTO findById(int id);
    List<UserDTO> findAll();
    UserDTO updateUser(UserDTO userDTO);
    void deleteUser(int id);


}
