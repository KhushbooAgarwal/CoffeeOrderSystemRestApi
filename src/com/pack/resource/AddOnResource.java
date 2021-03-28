package com.pack.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pack.coffee.model.bean.AddOn;
import com.pack.coffee.model.bean.Customers;
import com.pack.coffee.model.service.AddOnService;
import com.pack.coffee.model.service.CustomerService;

@RestController
public class AddOnResource {
	
	@Autowired
	private AddOnService addOnServ;
	
	@GetMapping(path="/addOns",produces="application/json")
	public ArrayList<AddOn> getAllAddOn()
	{
		
			return addOnServ.getAllAddOn();
		
	}
	
	@GetMapping(path = "/json/addOns/{addOnName}", produces = "application/json" )
	public AddOn getAddOnByName(@PathVariable("addOnName")String addOnName)
	{
		return addOnServ.getAddOnByName(addOnName);
	}
	
	@GetMapping(path = "/json/addOns/price/{addOnName}", produces = "application/json" )
	public float getAddOnPriceByName(@PathVariable("addOnName")String addOnName)
	{
		return addOnServ.getAddOnPriceByName(addOnName);
	}
	
	@GetMapping(path = "/json/addOns/price/{addOnId}", produces = "application/json" )
	public float getAddOnPriceById(@PathVariable("addOnId")int addOnId)
	{
		return addOnServ.getAddOnPriceById(addOnId);
	}
	
	@GetMapping(path = "/json/addOns/{addOnId}", produces = "application/json" )
	public AddOn getAddOnDetailsById(int addOnId)
	{
		return addOnServ.getAddOnDetailsById(addOnId);
	}
	

}
