package com.coforge.day3;

public class Product {
	private int id;
	private String name;
	private int price;
	private int quantity;
	
	public Product(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int totalPrice() {
		return price * quantity;
	}
	

	public void bill() {
		System.out.println("The total bill for the product is :" + totalPrice());
	}
}
