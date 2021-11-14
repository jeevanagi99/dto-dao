package com.xworkz.Clock.DTO;

public class ClockDTO {

	private String brand;
	private String shape;
	private String color;
	private int price;

	public ClockDTO(String brand, String shape, String color, int price) {
		System.out.println("dto of clock is created");
		this.brand = brand;
		this.shape = shape;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
