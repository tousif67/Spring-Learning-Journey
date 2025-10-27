package com.spring.service;



public class Employee {
	private int id;
	private String name;
	private double salary;
	private String city;
	public Employee(int id, String name, double salary, String city) {
		super();
		System.out.println("Employee Bean Created.");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	
	public String employeeTask() {
		return "Every Employee acts productive but in reality they are less productive.";
	}
}