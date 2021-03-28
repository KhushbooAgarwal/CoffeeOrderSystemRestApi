package com.pack.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.coffee.model.bean.Customers;
import com.pack.coffee.model.service.CustomerService;

@RestController
public class CustomersResource {
	
	@Autowired
	private CustomerService custServ;
	
	@GetMapping(path="/customers/{phoneNumber}",produces="application/json")
	public Customers getCustomerByPhone(@PathVariable("phoneNumber") long phoneNum)
	{
		
			return custServ.getCustomerByPhone(phoneNum);
		
	}
	
	@PostMapping(path = "/json/customers/{custName}/{phoneNum}", produces = "application/json" )
	public int addCustomer(@PathVariable("custName")String custName,@PathVariable("phoneNum") long phoneNum)
	{
		return custServ.addCustomer(custName, phoneNum);
	}	
	
	@GetMapping(path = "/json/checkCustomers/{phoneNum}", produces = "application/json" )
	public int checkCustomer(@PathVariable("phoneNum") long phoneNum)
	{
		return custServ.checkCustomer(phoneNum);
	}
	
	@GetMapping(path = "/json/customers/getCustomerId/{custName}/{phoneNum}", produces = "application/json" )
	public Customers getCustomerId(@PathVariable("custName")String custName,@PathVariable("phoneNum") long phoneNum)
	{
		return custServ.getCustomerId(custName, phoneNum);
	}
	
	@GetMapping(path = "/json/customers/{id}", produces = "application/json" )
	public String getCustomerName(@PathVariable("id")int custId)
	{
		return custServ.getCustomerName(custId);
	}
}
