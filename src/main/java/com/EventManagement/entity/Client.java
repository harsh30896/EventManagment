package com.EventManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID clientId;
    private String role;
    private String address;
    private String username;
    private String password;
    private String loc;
    private String profilePic;
    private String email;
}
