package com.java.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyAssertionEqualsTest {
	
	@Test
	public void mySimpleEqualsTest() {
		
		String expectedResult="Narender";
		assertEquals(expectedResult, Employee.getHightPaidEmpName());
	}
	@Test
	public void myObjectEqualsTest() {
		Employee employee=new Employee(123, "Narender", 200000);
		
		assertEquals(employee, Employee.getEmpNamewithHightestSalary());
	}
}

class Employee{
	
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=(Employee)obj;
		boolean status = false;
		if(this.name.equalsIgnoreCase(name)&&this.id==employee.getId()&&this.salary==employee.getSalary()) {
			status=true;
		}
		return status;
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static String getHightPaidEmpName() {
		
		return "Narender";
	}
	
	public static Employee getEmpNamewithHightestSalary() {
		
		return new Employee(123, "Narender", 200000);
	}
	
}