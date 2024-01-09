package com.app.poc.netcracker.interview;

import java.io.Serializable;


public class Product implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String name;  //"book" , "bulb", "T-Shirt"
	private Double price;  // 100, 20, 400
	private Double discountPercentage; // 10%, 
	private Integer quantity; // 5, 2,1
	
	public Product(String name, Double price, Double discountPercentage, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.quantity = quantity;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
	
}
