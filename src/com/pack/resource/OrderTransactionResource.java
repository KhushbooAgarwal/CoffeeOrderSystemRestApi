package com.pack.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.coffee.model.bean.OrderTransaction;
import com.pack.coffee.model.service.OrderTransactionService;

@RestController
public class OrderTransactionResource {
	
	@Autowired
	private OrderTransactionService orderTransactionServ;
	
	@PostMapping(path = "/json/orderTransaction/{orderId}/{coffeeName}/{coffeeSize}/{addOnName}", produces = "application/json" )
	public int createOrderTran(@PathVariable("orderId") int orderId,
			@PathVariable("coffeeName")String coffeeName,@PathVariable("coffeeSize")String coffeeSize,
			@PathVariable("addOnName")String addOnName)
	{
		return orderTransactionServ.createOrderTran(orderId, coffeeName, coffeeSize, addOnName);
	}
	
	@GetMapping(path="/json/orderTransaction/{orderId}",produces="application/json")
	public ArrayList<OrderTransaction> getOrderTranByOrderID(@PathVariable("orderId") int orderId)
	{
		
			return orderTransactionServ.getOrderTranByOrderID(orderId);
		
	}
	
	@GetMapping(path="/json/orderTransaction/getCoffeeIdByOrderID/{orderId}",produces="application/json")
	public ArrayList<Integer> getCoffeeIdByOrderID(int orderId)
	{
		   return orderTransactionServ.getCoffeeIdByOrderID(orderId);
	}
	
	@GetMapping(path="/json/orderTransaction/getAddOnIdByOrderID/{orderId}",produces="application/json")
	public ArrayList<Integer> getAddOnIdByOrderID(int orderId)
	{
		   return orderTransactionServ.getAddOnIdByOrderID(orderId);
	}

}
