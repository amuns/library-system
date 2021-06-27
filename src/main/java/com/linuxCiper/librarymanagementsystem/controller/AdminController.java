package com.linuxCiper.librarymanagementsystem.controller;

import com.linuxCiper.librarymanagementsystem.dto.AdminDTO;
import com.linuxCiper.librarymanagementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<AdminDTO> getAll() {
        return adminService.findAll();
    }

    @PutMapping
    public AdminDTO update(@RequestBody AdminDTO adminDTO) {
        return adminService.updateAdmin(adminDTO);
    }

    @GetMapping("/{id}")
    public AdminDTO findByIdl(@PathVariable int id) {
        return adminService.findById(id);
    }
}
