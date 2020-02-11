package com.capgemini.medicalstoremanagment.service;

import java.util.List;

import com.capgemini.medicalstoremanagment.daoimp.VisitorDAOImp;

public class VisitorServiceImp implements VisitorInterface {
	VisitorDAOImp visitor = new VisitorDAOImp();

	public List detailsInfo() {
		return visitor.detailsInfo();

	}

	@Override
	public List medicineInfo() {
		return visitor.medicineInfo();
	}

}
