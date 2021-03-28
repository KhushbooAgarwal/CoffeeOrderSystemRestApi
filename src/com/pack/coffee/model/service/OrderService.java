package com.pack.coffee.model.service;

import java.util.Date;

import com.pack.coffee.model.bean.Orders;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderService {
	
	int CreateOrder(int customerId,String orderDate,int voucherId);
	Orders getOrderByCustid(int customerId) ;

}
