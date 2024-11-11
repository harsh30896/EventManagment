package com.EventManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID enquiryId;
    private String clientId; // Reference to Client by UUID
    private String providerId; // Reference to Provider by UUID
    private String  serviceId; // Reference to Service by UUID
    private LocalDate enquiryDate;
    private String enquiryNotes;
    private String contactNo;
    private String email;
    private Boolean isAccepted;
}
