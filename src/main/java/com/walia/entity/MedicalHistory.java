package com.walia.entity;

import jakarta.persistence.*;

@Entity
public class MedicalHistory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer visitId;
    private Float wight;
    private Float height;
    private Integer bp;
    private String referBy;
    @ManyToOne
    private Patient patientId;
}
