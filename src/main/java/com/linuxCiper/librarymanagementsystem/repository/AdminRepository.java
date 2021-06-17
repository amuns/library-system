package com.linuxCiper.librarymanagementsystem.repository;

import com.linuxCiper.librarymanagementsystem.model.Admin;
import com.linuxCiper.librarymanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    List<Admin> findByUser_firstname(String firstname);

    List<Admin> findByWorkingShift(String workingShift);

}
