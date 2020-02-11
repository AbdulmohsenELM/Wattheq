package com.ELM.stProject.Wattheq.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Certificates")
@Table
public class Certificate {

    @Id
    @Column(name = "CertificateID")
    private int certificateID;
    @Column(name = "CertificateName")
    private String certificateName;
    @Column(name = "CertificateType")
    private String certificateType;
    @Column(name = "CertificateDescription")
    private String certificateDescription;
    @Column(name = "CertificateDate")
    private String certificateDate;
    @Column(name = "CertificateStatus")
    private String certificateStatus;
    @Column(name = "CertificateDocument")
    private String certificateDocument;
    @Column(name = "UserID")
    private int userID;
    @Column(name = "OrgID")
    private int orgID;

    public Certificate() {}

    public Certificate(int certificateID, String certificateName, String certificateType, String certificateDescription, String certificateDate, String certificateStatus, String certificateDocument, int userID, int orgID) {
        this.certificateID = certificateID;
        this.certificateName = certificateName;
        this.certificateType = certificateType;
        this.certificateDescription = certificateDescription;
        this.certificateDate = certificateDate;
        this.certificateStatus = certificateStatus;
        this.certificateDocument = certificateDocument;
        this.userID = userID;
        this.orgID = orgID;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateDescription() {
        return certificateDescription;
    }

    public void setCertificateDescription(String certificateDescription) {
        this.certificateDescription = certificateDescription;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }

    public String getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    public String getCertificateDocument() {
        return certificateDocument;
    }

    public void setCertificateDocument(String certificateDocument) {
        this.certificateDocument = certificateDocument;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }
}
