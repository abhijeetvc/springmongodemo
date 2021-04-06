package com.springmongod.springmongodemo.controller;

import com.springmongod.springmongodemo.model.Employee;
import com.springmongod.springmongodemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/save")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @GetMapping("/getallemps")
    public List<Employee> getemp(){
        return employeeRepository.findAll();
    }
}
