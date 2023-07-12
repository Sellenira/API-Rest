package com.apiteste.demo.entities;

public class Product {
	private long id;
	private String name;
	private double price;
	
	private Department department;
	
	public Product() {
		
	}

	public Product(long id, String name, double price, Department department) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.department = department;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
