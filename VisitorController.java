package com.capgemini.medicalstoremanagement.controller;

import java.util.List;
import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.capgemini.medicalstoremanagement.dto.VisitorInfo;
import com.capgemini.medicalstoremanagement.dto.VisitorMedicineInfo;
import com.capgemini.medicalstoremanagement.factory.VisitorFactory;
import com.capgemini.medicalstoremanagment.exception.TryToOrder;
import com.capgemini.medicalstoremanagment.service.VisitorInterface;

public class VisitorController {
	static Logger log = LogManager.getLogger("main");

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		while (a != (1 | 2 | 3 | 4)) {
			log.info("Press 1 to UserInformation: ");
			log.info("Press 2 to MedicineInformation: ");
			log.info("press 3 Try to order");
			log.info("Press 4 to Go Back to Home ");
			log.info("Please enter your choice..");
			log.info("........................................................");
			a = scanner.nextInt();
			VisitorFactory factory = new VisitorFactory();
			VisitorInterface service = factory.getInstance();
			switch (a) {
			case 1: {
				List<VisitorInfo> list = service.detailsInfo();
				for (VisitorInfo m : list) {
					log.info(m.getUserId());
					log.info(m.getUserName());
					log.info(m.getUserAddress());
					log.info(m.getPincode());
					log.info(m.getUserDob());
					log.info(m.getUserDisease());
					log.info(m.getMedicineId());
					log.info(m.getMedbookingDate());
					log.info(m.getUserBookingId());
					log.info("------------------------------------------------------");
				}

				break;
			}
			case 2: {

				List<VisitorMedicineInfo> list1 = service.medicineInfo();
				for (VisitorMedicineInfo m1 : list1) {
					log.info(m1.getMedicineId());
					log.info(m1.getMedicineName());
					log.info(m1.getMedicineMfgDate());
					log.info(m1.getMedicineExpDate());
					log.info(m1.getMedicinePrice());
					log.info(m1.getMedicineCompany());
					log.info("------------------------------------------------------");
				}
				break;
			}

			case 3: {
				TryToOrder trytoorder = new TryToOrder();
				trytoorder.order("ertu");
				log.info("------------------------------------------------------");
				break;
			}
			case 4:
				log.info("Go Back to Home");
				log.info("------------------------------------------------------");
				break;
			default:
				log.info("Invalid");
				log.info("------------------------------------------------------");

			}
		}
	}
}