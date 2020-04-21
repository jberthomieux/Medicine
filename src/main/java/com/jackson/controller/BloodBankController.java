package com.jackson.controller;

import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.model.*;
import com.jackson.service.*;


@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/bloodBank")
public class BloodBankController {
@Autowired
private BloodBankService bloodBankService;

//private Map map = new Map(Member);

//@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value="/bloodBanks",method=RequestMethod.GET)
	public List<BloodBank> listMember(){
		return bloodBankService.getAllBloodBanks();
	 }
	@RequestMapping(value="/nanme/{name}" ,method=RequestMethod.GET)
	public List<BloodBank> searchBloodBankByType(@PathVariable(value="type") String type){
		return bloodBankService.getBloodBankByType(type);
	 }
	//@PreAuthorize("hasRole('USER')")
	@RequestMapping(value="/bloodBank/{id}",method= RequestMethod.GET)
	public BloodBank getOne(@PathVariable(value="id") int id) {
		return bloodBankService.getBloodBankById(id);
		}
	
	@RequestMapping(value="/add",method= RequestMethod.POST)
	public List<BloodBank> saveBloodBank(@RequestBody BloodBank bloodBank) {
		bloodBankService.saveOrUpdate(bloodBank);
         return bloodBankService.getAllBloodBanks();
	}
	
	@RequestMapping(value="/update/{id}",method= RequestMethod.PUT)
	public BloodBank updateBloodBank(@RequestBody BloodBank bloodBank, @PathVariable int id) {

		BloodBank newbloodBank=bloodBank;
		
		bloodBank=bloodBankService.getBloodBankById(id);
		//bloodBank.setLocation(newbloodBank.getLocation());
		bloodBank.setType(newbloodBank.getType());
		bloodBank.setPrice(newbloodBank.getPrice());
		bloodBank.setQty(newbloodBank.getQty());
		bloodBankService.saveOrUpdate(bloodBank);
		return bloodBankService.getBloodBankById(id);
		
    }
		
	@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE)
	public List<BloodBank> deleteById(@PathVariable(value="id") int id) {
		bloodBankService.delete(id);
		return bloodBankService.getAllBloodBanks();
	}
}

