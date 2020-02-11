package com.ELM.stProject.Wattheq.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Organizations")
@Table
public class Organization {

    @Id
    @Column(name = "OrganizationID")
    private int organizationID;
    @Column(name = "OrganizationName")
    private String organizationName;
    @Column(name = "OrganizationAddress")
    private String organizationAddress;
    @Column(name = "OrganizationContactNumber")
    private String organizationContactNumber;

    public Organization() {}

    public Organization(int organizationID, String organizationName, String organizationAddress, String organizationContactNumber) {
        this.organizationID = organizationID;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
        this.organizationContactNumber = organizationContactNumber;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public String getOrganizationContactNumber() {
        return organizationContactNumber;
    }

    public void setOrganizationContactNumber(String organizationContactNumber) {
        this.organizationContactNumber = organizationContactNumber;
    }
}
