package com.ELM.stProject.Wattheq.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Shared")
@Table
public class Shared {

    @Id
    @Column(name = "SharedID")
    private int sharedID;
    @Column(name = "UserID") //ManyToOne
    private int userID;
    @Column(name = "CertificateID") //ManyToMany
    private int certificateID;
    @Column(name = "SharedDate")
    private String sharedDate;
    @Column(name = "SharedUrl")
    private String sharedUrl;

    public Shared() {}

    public Shared(int sharedID, int userID, int certificateID, String sharedDate, String sharedUrl) {
        this.sharedID = sharedID;
        this.userID = userID;
        this.certificateID = certificateID;
        this.sharedDate = sharedDate;
        this.sharedUrl = sharedUrl;
    }

    public int getSharedID() {
        return sharedID;
    }

    public void setSharedID(int sharedID) {
        this.sharedID = sharedID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public String getSharedDate() {
        return sharedDate;
    }

    public void setSharedDate(String sharedDate) {
        this.sharedDate = sharedDate;
    }

    public String getSharedUrl() {
        return sharedUrl;
    }

    public void setSharedUrl(String sharedUrl) {
        this.sharedUrl = sharedUrl;
    }
}
