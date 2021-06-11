package com.linuxCiper.librarymanagementsystem.model;

import com.linuxCiper.librarymanagementsystem.dto.UserDTO;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private String address;
    private int phone;

    public User() {

    }

    public User(UserDTO userDTO){
        this.id=userDTO.getId();
        this.username=userDTO.getUsername();
        this.password=userDTO.getPassword();
        this.email=userDTO.getEmail();
        this.firstname=userDTO.getFirstname();
        this.lastname=userDTO.getLastname();
        this.address=userDTO.getAddress();
        this.phone=userDTO.getPhone();
    }

    public User(int id, String username, String password, String email, String firstname, String lastname, String address, int phone) {
        this.id=id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}