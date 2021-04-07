package com.springmongod.springmongodemo.controller;

import com.springmongod.springmongodemo.model.Employee;
import com.springmongod.springmongodemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/search/{searchString}")
    public List<Employee> searchEmps(@PathVariable String searchString){
        return employeeRepository.searchEmployees(searchString);
    }
}
