package com.app.poc.netcracker.interview;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Book", 100d, 10d, 5));
		list.add(new Product("Bulb", 20d, null, 2));
		list.add(new Product("T-shirt", 400d, null, 1));

		/*
		 * //Total price = (5*100 - 500%10) + 20*2 + 400*1
		 * 
		 * 450+40=490+400 =890
		 */
		Double totalPrice = 0d;

		for (Product product : list) {

			Double actualPrice = product.getPrice() * product.getQuantity();

			if (product.getDiscountPercentage() != null) {

				totalPrice += (actualPrice - (actualPrice * product.getDiscountPercentage()) / 100);

			} else {
				totalPrice += actualPrice;
			}

		}

		System.out.println("total Price: " + totalPrice);

	}
}
