package com.xworkz.SmartWatch.DAO;

import com.xworkz.SmartWatch.DTO.SmartWatchDTO;

public class SmartWatchDAO {

	SmartWatchDTO smartWatchArray[] = new SmartWatchDTO[5];
	int index = 0;

	public SmartWatchDAO() {
		System.out.println("SmartWatch dao is created");
	}

	public void saveDto(SmartWatchDTO dto) {
		System.out.println("inside the save method");
		System.out.println();
		smartWatchArray[index] = dto;
		index++;

	}

	public void displaySmartWatch() {
		System.out.println("");
		System.out.println("display method invoked");
		System.out.println("-------------------");
		for (int i = 0; i < smartWatchArray.length; i++) {
			if (smartWatchArray[i] != null) {
				System.out.println(smartWatchArray[i].getSerialNumber());
				System.out.println(smartWatchArray[i].getBrand());
				System.out.println(smartWatchArray[i].getColor());
				System.out.println(smartWatchArray[i].getPrice());
				System.out.println("-------------------");
				System.out.println();

			}
		}
	}

	public void displayByBrandName(String brand) {

		System.out.println("display by Name method invoked");
		for (int i = 0; i < smartWatchArray.length; i++) {
			if (smartWatchArray[i].getBrand().equals(brand)) {

				System.out.println(smartWatchArray[i].getSerialNumber());
				System.out.println(smartWatchArray[i].getBrand());
				System.out.println(smartWatchArray[i].getColor());
				System.out.println(smartWatchArray[i].getPrice());
				// i++;

			}

		}
	}

	public void updateByBrandName(String brand, int newPrice) {
		System.out.println();
		System.out.println("update method invoked");
		for (int i = 0; i < smartWatchArray.length; i++) {
			if (smartWatchArray[i].getBrand().equals(brand)) {
				smartWatchArray[i].setPrice(newPrice);
				System.out.println("updated succesfuly");

			}
		}

	}

	public void deleteByBrandName(String brand) {
		System.out.println();
		System.out.println("delete method invoked");
		for (int i = 0; i < smartWatchArray.length; i++) {
			if (smartWatchArray[i].getBrand().equals(brand)) {
				smartWatchArray[i] = null;
				System.out.println("item is deleted");
				// break;

			}

		}

	}

}
