package com.springmongod.springmongodemo.repository;

import com.springmongod.springmongodemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
