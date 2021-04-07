package com.springmongod.springmongodemo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Getter
@Setter
public class Employee {

    @Id
    private String id;
    private String name;
    private String city;
    private String address;
    private List<String> emails;

    @DBRef
    private Department department;
}

// AOP : Aspect, JoinPoint, Pointcut, Advice