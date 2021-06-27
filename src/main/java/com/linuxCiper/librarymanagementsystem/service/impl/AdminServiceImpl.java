package com.linuxCiper.librarymanagementsystem.service.impl;

import com.linuxCiper.librarymanagementsystem.dto.AdminDTO;
import com.linuxCiper.librarymanagementsystem.dto.UserDTO;
import com.linuxCiper.librarymanagementsystem.model.Admin;
import com.linuxCiper.librarymanagementsystem.model.User;
import com.linuxCiper.librarymanagementsystem.repository.AdminRepository;
import com.linuxCiper.librarymanagementsystem.repository.UserRepository;
import com.linuxCiper.librarymanagementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<AdminDTO> findAll() {
        List<Admin> adminList = adminRepository.findAll();
        List<AdminDTO> adminDTOList = new ArrayList<>();
        for (Admin admin : adminList) {
            AdminDTO adminDTO = new AdminDTO(admin);
            UserDTO userDTO = new UserDTO(admin.getUser());
            adminDTO.setUserDTO(userDTO);
            adminDTOList.add(adminDTO);

        }
        return adminDTOList;
    }

    @Override
    public AdminDTO findById(int id) {
        Optional<Admin> optionalAdmin = adminRepository.findById(id);
        Admin admin = optionalAdmin.orElseThrow(() -> new RuntimeException("Admin with given Id not found"));
        AdminDTO adminDTO = new AdminDTO(admin);
        UserDTO userDTO = new UserDTO(admin.getUser());
        adminDTO.setUserDTO(userDTO);
        return adminDTO;
    }

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public AdminDTO updateAdmin(AdminDTO adminDTO) {
        Optional<Admin> optionalAdmin = adminRepository.findById(adminDTO.getId());
        Admin admin = optionalAdmin.orElseThrow(() -> new RuntimeException("Admin id cannot found"));
        admin.setPosition(admin.getPosition());
        admin.setJoiningDate(admin.getJoiningDate());
        admin.setWorkingShift(admin.getWorkingShift());
        //userDto to update user related data
        UserDTO userDTO = adminDTO.getUserDTO();
        //user associate to the admin
        User user = admin.getUser();
        user.setAddress(userDTO.getAddress());
        user.setEmail(userDTO.getEmail());
        user.setFirstname(userDTO.getFirstname());
        user.setLastname(userDTO.getLastname());
        //save the updated user to user repository
        User updatedUser = userRepository.save(user);
        //set the update user to admin
        admin.setUser(updatedUser);
            //save the updated admin
        Admin updatedAdmin = adminRepository.save(admin);
        //convert the updated admin and user to dtos
        AdminDTO updatedAdminDto = new AdminDTO(updatedAdmin);
        updatedAdminDto.setUserDTO(new UserDTO(updatedAdmin.getUser()));
        return updatedAdminDto;
    }
}
