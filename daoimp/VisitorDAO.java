package com.capgemini.medicalstoremanagment.daoimp;

import java.util.List;

import com.capgemini.medicalstoremanagement.dto.VisitorInfo;
import com.capgemini.medicalstoremanagement.dto.VisitorMedicineInfo;

public interface VisitorDAO {
	 public List<VisitorInfo> detailsInfo();
	 public List<VisitorMedicineInfo> medicineInfo();
}
	 
