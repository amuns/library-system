package com.linuxCiper.librarymanagementsystem.dto;

import com.linuxCiper.librarymanagementsystem.model.Admin;

import java.time.LocalDate;

public class AdminDTO {

    private int id;
    private String workingShift;
    private LocalDate joiningDate;
    private String position;
    private UserDTO userDTO;

    public AdminDTO(Admin admin) {
        this.id = admin.getId();
        this.position = admin.getPosition();
        this.joiningDate = admin.getJoiningDate();
        this.workingShift = admin.getWorkingShift();

    }

    public AdminDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkingShift() {
        return workingShift;
    }

    public void setWorkingShift(String workingShift) {
        this.workingShift = workingShift;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
