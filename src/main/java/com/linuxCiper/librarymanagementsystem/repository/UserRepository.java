package com.linuxCiper.librarymanagementsystem.repository;

import com.linuxCiper.librarymanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //@Query("Select * from User where username=:username and password=:password")
    //Optional<User> loginQuery();

    Optional<User> findByUsernameAndPassword(String username, String password);
}
