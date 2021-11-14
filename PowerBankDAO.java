package com.xworkz.PowerBank.DAO;

import com.xworkz.PowerBank.DTO.PowerBankDTO;


public class PowerBankDAO {

	public PowerBankDAO() {
		System.out.println("inside the PowerBankDAO Constructor ");
	}

	public void displayPowerBankDAO(PowerBankDTO dto) {
		System.out.println(dto.getBrand());
		System.out.println(dto.getMah());
		System.out.println(dto.getColor());
		System.out.println(dto.getPrice());

	}

	public  PowerBankDTO createPowerBank(String brand, int mah, String color, int price){
			System.out.println("inside the create method of powerbankdao");
			PowerBankDTO powerBankDTO = new  PowerBankDTO(brand, mah, color, price);
			return powerBankDTO;
	}
	
	public   PowerBankDTO updatePowerBank(PowerBankDTO obj , int newPrice) {
			System.out.println("inside a update method");
			obj.setPrice(newPrice);
			return obj;
		
	}


	
}
