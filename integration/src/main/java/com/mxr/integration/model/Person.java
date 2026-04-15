package com.mxr.integration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Builder

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @NotNull
    private String name;

    @NotNull
    private String gender;

    private double genderProbability;

    private int sampleSize;

    private int age;

    private String ageGroup;

    private String countryId;

    private double countryProbability;

    @CreationTimestamp
    private LocalDateTime createdAt;


    
}
