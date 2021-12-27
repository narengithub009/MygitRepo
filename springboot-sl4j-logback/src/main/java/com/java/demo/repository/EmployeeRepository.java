package com.java.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
