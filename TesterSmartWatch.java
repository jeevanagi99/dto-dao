package com.xworkz.SmartWatch;

import com.xworkz.SmartWatch.DAO.SmartWatchDAO;
import com.xworkz.SmartWatch.DTO.SmartWatchDTO;

public class TesterSmartWatch {

	public static void main(String[] args) {
		SmartWatchDAO dao = new SmartWatchDAO();

		SmartWatchDTO mi = new SmartWatchDTO(1, "mi", "black", 1300);
		dao.saveDto(mi);

		SmartWatchDTO noise = new SmartWatchDTO(2, "noise", "sliver", 2000);
		dao.saveDto(noise);

		SmartWatchDTO samsung = new SmartWatchDTO(3, "samsung", "white", 1100);
		dao.saveDto(samsung);

		SmartWatchDTO oneplus= new SmartWatchDTO(4, "oneplus", "red", 3000);
		dao.saveDto(oneplus);

		SmartWatchDTO sony = new SmartWatchDTO(5, "sony", "black", 2300);
		dao.saveDto(sony);

		dao.displaySmartWatch();
		dao.updateByBrandName("sony", 1200);
		dao.displaySmartWatch();
		dao.deleteByBrandName("sony");
		dao.displaySmartWatch();

	}

}
