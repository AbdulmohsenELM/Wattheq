package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Authority")
@Table
public class Authority {

    @Id
    @Column(name = "AuthorityID")
    private int authorityID;
    @Column(name = "AuthorityName")
    private String authorityName;
    @Column(name = "AuthorityDescription")
    private String authorityDescription;

    @OneToMany(mappedBy = "authority", cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();

    public Authority() {}

    public Authority(int authorityID, String authorityName, String authorityDescription) {
        this.authorityID = authorityID;
        this.authorityName = authorityName;
        this.authorityDescription = authorityDescription;
    }

    public int getAuthorityID() {
        return authorityID;
    }

    public void setAuthorityID(int authorityID) {
        this.authorityID = authorityID;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getAuthorityDescription() {
        return authorityDescription;
    }

    public void setAuthorityDescription(String authorityDescription) {
        this.authorityDescription = authorityDescription;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
