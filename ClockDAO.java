package com.xworkz.Clock.DAO;

import com.xworkz.Clock.DTO.ClockDTO;

public class ClockDAO {

	ClockDTO clockArray[] = new ClockDTO[5];
	int index = 0;

	public ClockDAO() {
		System.out.println("dao is created");
	}

	public void saveClock(ClockDTO dto) {
		System.out.println("save method ");
		for (int i = 0; i < clockArray.length; i++) {
			clockArray[index] = dto;
			index++;

		}

	}

	public void displayAll() {
		System.out.println("display method is called");
		for (int i = 0; i < clockArray.length; i++) {
			if (clockArray[i] != null) {
				System.out.println(clockArray[i].getBrand());
				System.out.println(clockArray[i].getShape());
				System.out.println(clockArray[i].getColor());
				System.out.println(clockArray[i].getPrice());

			}

		}
	}

}
