package com.org.tav.handson.day4;

public class Product {
	int productID;
	String name;
	int price;
	double rating;
	public Product(int productID, String name, int price, double rating) {
	super();
	this.productID = productID;
	this.name = name;
	this.price = price;
	this.rating = rating;
	}
	@Override
	public String toString() {
	return "Product [productID=" + productID + ", name=" + name + ", price=" + price + ", rating=" + rating + "]";

}
}