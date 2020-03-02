package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Authority")
@Table
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AuthorityID")
    private int authorityID;
    @Column(name = "username")
    private String username;
    @Column(name = "Authority")
    private String authority;

    public Authority() {}

    public Authority(int authorityID, String authorityName, String authorityDescription) {
        this.authorityID = authorityID;
        this.username = authorityName;
        this.authority = authorityDescription;
    }

    public int getAuthorityID() {
        return authorityID;
    }

    public void setAuthorityID(int authorityID) {
        this.authorityID = authorityID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
