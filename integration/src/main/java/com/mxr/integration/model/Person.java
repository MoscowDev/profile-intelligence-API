package com.mxr.integration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    
    @NotNull
    String name;

    @NotNull
    String gender;

    double genderProbability;

    int count;

    int age;

    int ageGroup;

    int countryId;

    
}
