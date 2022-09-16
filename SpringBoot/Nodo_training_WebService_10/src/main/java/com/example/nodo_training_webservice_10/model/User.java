package com.example.nodo_training_webservice_10.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERNAME",uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
public class User {
    @Id
    @Column(name = "username",unique = true,nullable = false)
    private String username;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private int age;
    @Column(name = "groupId",nullable = false)
    private int groupId;
}
