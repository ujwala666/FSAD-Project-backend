package com.fsad.artgallery.model;

import jakarta.persistence.*;

@Entity
public class NetworkContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private String email;
    private String orgName;

    public NetworkContact() {}

    public NetworkContact(String name, String role, String email, String orgName) {
        this.name = name;
        this.role = role;
        this.email = email;
        this.orgName = orgName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) { this.orgName = orgName; }
}
