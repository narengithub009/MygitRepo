package com.java;

public class EncapsulationTest {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setId("12");
				System.out.println(employee.getId());
	}
}

class Employee{
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	
}
