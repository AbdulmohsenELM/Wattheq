package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {


    @Id
    @Column(name = "NationalID")
    private int nationalID;
    @Column(name = "Fullname")
    private String fullname;
    @Column(name = "PhoneNumber")
    private int phonenumber;
    @Column(name = "DateOfBirth")
    private String dob;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;


    public User() {

    }
    public User(int nationalID, String fullname, int phonenumber, String dob, String email, String password) {
        this.nationalID = nationalID;
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
