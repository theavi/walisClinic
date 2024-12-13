package com.walia.entity;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    private Integer createBy;
    private Date createdDate;
    private Integer modifiedBy;
    private Date modifiedDate;

}
