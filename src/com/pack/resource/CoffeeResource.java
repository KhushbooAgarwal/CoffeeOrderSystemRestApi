package com.pack.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pack.coffee.model.bean.AddOn;
import com.pack.coffee.model.bean.Coffee;
import com.pack.coffee.model.service.AddOnService;
import com.pack.coffee.model.service.CoffeeService;

@RestController
public class CoffeeResource {
	
	@Autowired
	private CoffeeService coffeeServ;
	
	@GetMapping(path="/json/coffees",produces="application/json")
	public ArrayList<Coffee> getAllCoffeeDetails()
	{
		
			return coffeeServ.getAllCoffeeDetails();
		
	}
	
	@GetMapping(path="/json/coffeesName",produces="application/json")
	public ArrayList<String> getAllCoffeeNameDetails()
	{
		
			return coffeeServ.getAllCoffeeNameDetails();
		
	}
	
	@GetMapping(path="/json/coffeesSizes",produces="application/json")
	public ArrayList<String> getAllCoffeeSize()
	{
		
			return coffeeServ.getAllCoffeeSize();
		
	}
	
	@GetMapping(path = "/json/coffees/{coffeeName}/{coffeeSize}", produces = "application/json" )
	public Coffee getCoffeeByNameAndSize(@PathVariable("coffeeName")String coffeeName ,@PathVariable("coffeeSize") String coffeeSize)
	{
		return coffeeServ.getCoffeeByNameAndSize(coffeeName, coffeeSize);
	}
	
	@GetMapping(path = "/json/coffees/{coffeeId}", produces = "application/json" )
	public float getPriceByCoffeeId(@PathVariable("coffeeId")int coffeeId)
	{
		return coffeeServ.getPriceByCoffeeId(coffeeId);
	}
	
	@GetMapping(path = "/json/coffees/details/{coffeeId}", produces = "application/json" )
	public Coffee getCoffeeDetailsById(@PathVariable("coffeeId")int coffeeId)
	{
		return coffeeServ.getCoffeeDetailsById(coffeeId);
	}

}
