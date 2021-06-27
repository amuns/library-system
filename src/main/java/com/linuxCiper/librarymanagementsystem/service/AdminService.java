package com.linuxCiper.librarymanagementsystem.service;

import com.linuxCiper.librarymanagementsystem.dto.AdminDTO;
import com.linuxCiper.librarymanagementsystem.model.Admin;

import java.util.List;

public interface AdminService {
    List<AdminDTO> findAll();
    AdminDTO findById(int id);
    Admin addAdmin(Admin admin);
    AdminDTO updateAdmin(AdminDTO adminDTO);
}
