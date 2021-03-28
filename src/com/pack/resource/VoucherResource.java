package com.pack.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pack.coffee.model.bean.Customers;
import com.pack.coffee.model.bean.Vouchers;
import com.pack.coffee.model.service.VoucherService;

@RestController
public class VoucherResource {
	
	@Autowired
	private VoucherService vouchServ;
	
	@GetMapping(path="/vouchers",produces="application/json")
	public ArrayList<Vouchers> getAllVouchers()
	{
		
			return vouchServ.getAllVochers();
		
	}

	@GetMapping(path="/vouchers/{voucherName}",produces="application/json")
	public Vouchers getCustomerByPhone(@PathVariable("voucherName") String voucherName)
	{
		
			return vouchServ.getVoucherByVoucherName(voucherName);
		
	}
}
