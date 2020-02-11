package com.capgemini.medicalstoremanagment.service;

import java.util.List;

import com.capgemini.medicalstoremanagement.dto.VisitorInfo;
import com.capgemini.medicalstoremanagement.dto.VisitorMedicineInfo;

public interface VisitorInterface {
	List<VisitorInfo> detailsInfo();
    List<VisitorMedicineInfo> medicineInfo();


}
