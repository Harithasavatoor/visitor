package com.capgemini.medicalstoremanagement.userserviceimp;

import com.capgemini.medicalmanagementinfo.userdaoimp.UserDAOImp;
import com.capgemini.medicalstoremanagementInfo.dto.ShoppingCartPojo;
import com.capgemini.medicalstoremanagementInfo.service.UserSevice;

public class UserServiceImp implements UserSevice {
	UserDAOImp udai = new UserDAOImp();

	public void deleteCart() {
		udai.deleteCart(ShoppingCartPojo.getMedicineName());
	}

}
