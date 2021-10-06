package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo
{
    @Id
    private int UserID;
    private int UserName;
    private String name;
    private int phoneNumber;
    private String branch;
    private String year;

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getUserName() {
        return UserName;
    }

    public void setUserName(int userName) {
        UserName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getYear() { return year; }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
