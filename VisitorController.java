package com.capgemini.medicalstoremanagement.controller;

import java.util.List;
import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.capgemini.medicalstoremanagement.dto.VisitorInfo;
import com.capgemini.medicalstoremanagement.dto.VisitorMedicineInfo;
import com.capgemini.medicalstoremanagement.factory.VisitorFactory;
import com.capgemini.medicalstoremanagment.exception.OrderNotPossibleException;
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
					log.info("UserId:" + m.getUserId());
					log.info("UserName:" + m.getUserName());
					log.info("UserAddress:" + m.getUserAddress());
					log.info("UserPincode:" + m.getPincode());
					log.info("UserDob:" + m.getUserDob());
					log.info("UserDisease:" + m.getUserDisease());
					log.info("UserMedicineId:" + m.getMedicineId());
					log.info("UserMedBookingDate:" + m.getMedbookingDate());
					log.info("UserBookingId" + m.getUserBookingId());
					log.info("------------------------------------------------------");
				}

				break;
			}
			case 2: {

				List<VisitorMedicineInfo> list1 = service.medicineInfo();
				for (VisitorMedicineInfo m1 : list1) {
					log.info("MedicineId:" + m1.getMedicineId());
					log.info("MedicineName:" + m1.getMedicineName());
					log.info("MedicineMfgDate:" + m1.getMedicineMfgDate());
					log.info("MedicineExpDate:" + m1.getMedicineExpDate());
					log.info("MedicinePrice:" + m1.getMedicinePrice());
					log.info("MedicineCompany:" + m1.getMedicineCompany());
					log.info("------------------------------------------------------");
				}
				break;
			}

			case 3: {
				OrderNotPossibleException onpe = new OrderNotPossibleException();
				log.info(onpe.getMessage());
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