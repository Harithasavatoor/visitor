package com.capgemini.medicalstoremanagment.exception;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TryToOrder {
	public void order(String medicinestoreinfo) throws OrderNotPossibleException {
		Logger log = LogManager.getLogger("main");
		String order=null;
		if(order==medicinestoreinfo) {
			throw new OrderNotPossibleException("oredr not possible");
		}else {
			log.info("You can only view the details, Order is not Possible");
		}
	}

}
