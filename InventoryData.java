package com.bridglab.objectoriented;

public class InventoryData {
	public String name;
	public final double weight;
	public final double price;

	public InventoryData(String name, double weight, double price) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	public void total() {
		System.out.println("inventory "+name+" is "+weight+" kg "+price+" Rupees");
	}

}
