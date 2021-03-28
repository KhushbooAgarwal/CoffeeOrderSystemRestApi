package com.pack.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.coffee.model.bean.Invoices;
import com.pack.coffee.model.service.InvoiceService;

@RestController
public class InvoiceResource {
	
	@Autowired
	private InvoiceService invoiceServ;
	
	@PostMapping(path = "/json/invoices/{orderId}/{voucherName}/{coffeeName}/{coffeeSize}/{addOnName}", produces = "application/json" )
	public int createInvoice(@PathVariable("orderId")int orderId,@PathVariable("voucherName")String voucherName,@PathVariable("coffeeName") String coffeeName,
			@PathVariable("coffeeSize")String coffeeSize,@PathVariable("addOnName") String addOnName)
	{
		return invoiceServ.createInvoice(orderId, voucherName, coffeeName, coffeeSize, addOnName);
	}	
	
	@GetMapping(path="/invoices/{orderId}",produces="application/json")
	public Invoices getInvoiceByOrderId(@PathVariable("orderId") int orderId)
	{
		
			return invoiceServ.getInvoiceByOrderId(orderId);
		
	}
	
	
	

}
