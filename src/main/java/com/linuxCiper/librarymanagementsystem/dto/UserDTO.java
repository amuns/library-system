package com.linuxCiper.librarymanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.linuxCiper.librarymanagementsystem.model.User;
import com.linuxCiper.librarymanagementsystem.utils.Roles;

import java.time.LocalDate;

public class UserDTO {
    private int id;
    private String username;
    @JsonProperty(access =  JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private String address;
    private int phone;
    private Roles roles;
    //for Admin signup
    @JsonProperty(access =  JsonProperty.Access.WRITE_ONLY)
    private String workingShift;
    @JsonProperty(access =  JsonProperty.Access.WRITE_ONLY)
    private String position;
    @JsonProperty(access =  JsonProperty.Access.WRITE_ONLY)
    private LocalDate joiningDate;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.address = user.getAddress();
        this.phone = user.getPhone();
        this.roles = user.getRoles();
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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String getWorkingShift() {
        return workingShift;
    }

    public void setWorkingShift(String workingShift) {
        this.workingShift = workingShift;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
}
