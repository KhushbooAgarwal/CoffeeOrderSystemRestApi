package com.pack.coffee.model.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.pack.coffee.model.bean.Customers;


public interface CustomerService {

	int addCustomer(String custName, long phoneNum);
	Customers getCustomerByPhone(long phoneNum)  ;
	int checkCustomer(long phoneNum);
	Customers getCustomerId(String custName,long phoneNum);
	String getCustomerName(int custId);
}

