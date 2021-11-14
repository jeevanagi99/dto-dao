package com.xworkz.SmartWatch.DTO;

public class SmartWatchDTO {
	
	private int serialNumber;
	private String Brand;
	private String color;
	private int price;
	
	public SmartWatchDTO(int serialNumber, String brand, String color, int price) {
		System.out.println("SmartWatch DTO is created");
		this.serialNumber = serialNumber;
		this.Brand = brand;
		this.color = color;
		this.price = price;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		this.Brand = brand;
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
