package com.EventManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID serviceId;
    private UUID providerId; // Reference to Provider by UUID
    private String serviceName;
    private Double price;
    private LocalDate availabilityFrom;
    private LocalDate availabilityTo;
}
