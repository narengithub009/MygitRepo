package com.java.demo.service;

import java.util.List;

import com.java.demo.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmpolyee(Employee employee,long id);
	void deleteEmployee(long id);
}
