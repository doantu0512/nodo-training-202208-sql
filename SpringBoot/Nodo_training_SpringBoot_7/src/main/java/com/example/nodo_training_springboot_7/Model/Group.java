package com.example.nodo_training_springboot_7.Model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name="Student_KANZY2",
        uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name="name", nullable = false, length = 100)
    private String name;
}