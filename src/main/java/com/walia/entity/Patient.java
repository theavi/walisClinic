package com.walia.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Patient extends  BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    private String firstName;
    private String middleName;
    private String surname;
    private String address;
    private String contact;
    @OneToMany(mappedBy ="patientId" )
    private ArrayList<MedicalHistory> histories;
}
