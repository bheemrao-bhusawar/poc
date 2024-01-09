package com.app.poc.test;

import java.io.Serializable;

public class ProductVo implements Serializable {

	private String productName;
	private double productPrice;

	public ProductVo(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public ProductVo() {
		super();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

}
