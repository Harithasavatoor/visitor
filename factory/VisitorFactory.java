package com.capgemini.medicalstoremanagement.factory;
import com.capgemini.medicalstoremanagment.service.VisitorInterface;
import com.capgemini.medicalstoremanagment.service.VisitorServiceImp;

public class VisitorFactory {
	public static VisitorInterface getInstance() {
		VisitorInterface visitorInterface = new VisitorServiceImp();
		return visitorInterface;
	}	

}
