package com.xworkz.PowerBank.DTO;

public class PowerBankDTO {
	
	private String brand;
	private int mah;
	private String color;
	private int price;
	
	

	public PowerBankDTO(String brand, int mah, String color, int price) {
		
		this.brand = brand;
		this.mah = mah;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMah() {
		return mah;
	}

	public void setMah(int mah) {
		this.mah = mah;
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
