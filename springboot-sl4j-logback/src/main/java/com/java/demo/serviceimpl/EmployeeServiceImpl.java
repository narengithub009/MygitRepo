package com.java.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.demo.exception.ResourseNotFountException;
import com.java.demo.model.Employee;
import com.java.demo.repository.EmployeeRepository;
import com.java.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {

		Optional<Employee> employee=employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}else {
			throw new ResourseNotFountException("Employee", "Id", id);
		}
	}


	@Override
	public Employee updateEmpolyee(Employee employee, long id) {
		Employee existingEmployee=employeeRepository.findById(id)
				.orElseThrow(() -> new ResourseNotFountException("Employee", "ID", id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}


	@Override
	public void deleteEmployee(long id) {
		
		employeeRepository.findById(id).orElseThrow(()-> new ResourseNotFountException("Employee", "ID", id));
		employeeRepository.deleteById(id);
		
	}

}
