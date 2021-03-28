package com.pack.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.coffee.model.bean.Orders;
import com.pack.coffee.model.service.OrderService;

@RestController
public class OrdersResource {
	
	@Autowired
	private OrderService orderServ;
	
	@PostMapping(path = "/json/orders/{customerId}/{orderDate}/{voucherId}", produces = "application/json" )
	public int CreateOrder(@PathVariable("customerId") int customerId,
			@PathVariable("orderDate")String orderDate,@PathVariable("voucherId") int voucherId)
	{
		return orderServ.CreateOrder(customerId, orderDate, voucherId);
	}
	
	@GetMapping(path="/json/orders/{customerId}",produces="application/json")
	public Orders getOrderByCustid(@PathVariable("customerId") int customerId)
	{
		return orderServ.getOrderByCustid(customerId);
	}
	
	

}
