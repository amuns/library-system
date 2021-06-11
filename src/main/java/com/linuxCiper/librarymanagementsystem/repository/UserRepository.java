package com.linuxCiper.librarymanagementsystem.repository;

import com.linuxCiper.librarymanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
