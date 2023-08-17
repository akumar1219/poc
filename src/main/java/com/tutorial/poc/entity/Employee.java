package com.tutorial.poc.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "employee")
@Data
@Builder
public class Employee {

    @Column(name = "emp_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;
    @Column(name = "salary")
    private int salary;

    @Column(name = "emp_name")
    private String name;

}
