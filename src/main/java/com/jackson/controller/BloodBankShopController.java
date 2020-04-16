package com.jackson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.model.BloodBankShop;
import com.jackson.service.BloodBankShopService;



@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/bbshop")
public class BloodBankShopController{
@Autowired
private BloodBankShopService bloodBankShopService;

//@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value="/bbshops",method=RequestMethod.GET)
	public List<BloodBankShop> listUser(){
		return bloodBankShopService.getAllbloodbank();
	 }
	//@PreAuthorize("hasRole('USER')")
	@RequestMapping(value="/bbshop/{id}",method= RequestMethod.GET)
	public BloodBankShop getOne(@PathVariable(value="id") int id) {
		return bloodBankShopService.getBloodBankShoopById(id);
		
	}
	@RequestMapping(value="/add",method= RequestMethod.POST)
	public List<BloodBankShop> saveBloodBankShop(@RequestBody BloodBankShop bloodBankShop) {
		bloodBankShopService.saveOrUpdate(bloodBankShop);
         return bloodBankShopService.getAllbloodbank();
	}
	@RequestMapping(value="/update",method= RequestMethod.PUT)
	public BloodBankShop updateBloodBankShop(@RequestBody BloodBankShop bloodBankShop, int id) {
		bloodBankShopService.update(bloodBankShop,id);
         return bloodBankShopService.getBloodBankShoopById(id);
	}

	@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE)
	public List<BloodBankShop> deleteById(@PathVariable(value="id") Long id) {
		return bloodBankShopService.getAllbloodbank();
	}
}
