
package com.jackson.controller;

import java.util.List;
//import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.dto.BbSearchResponse;
import com.jackson.model.BloodBank;
import com.jackson.model.BloodBankShop;
import com.jackson.service.BloodBankShopService;


@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/bbshop")
public class BloodBankShopController {
	@Autowired
	private BloodBankShopService bloodBankShopService;

	//@PreAuthorize("hasRole('ADMIN')")
		@RequestMapping(value="/shops",method=RequestMethod.GET)
		public List<BloodBankShop> listMember(){
			return bloodBankShopService.getAllbloodbank();
		 }
		@RequestMapping(value="/result",method=RequestMethod.GET)
		public List<BbSearchResponse> result(){
			return bloodBankShopService.searchResult();
		}
		@RequestMapping(value="/shopnanme/{name}",method=RequestMethod.GET)
		public List<BloodBankShop> searchBloodBankShopByName(@PathVariable(value="name") String name){
			return bloodBankShopService.getBloodBankShopByName(name);
		 }
				
		//@PreAuthorize("hasRole('USER')")
		@RequestMapping(value="/shop/{id}",method= RequestMethod.GET)
		public BloodBankShop getOne(@PathVariable(value="id") int id) {
			return bloodBankShopService.getBloodBankShopById(id);
			}
		
		@RequestMapping(value="/add",method= RequestMethod.POST)
		public List<BloodBankShop> saveBloodBankShop(@RequestBody BloodBankShop bloodBankShop) {
			bloodBankShopService.saveOrUpdate(bloodBankShop);
	         return bloodBankShopService.getAllbloodbank();
		}
		
		@RequestMapping(value="/update/{id}",method= RequestMethod.PUT)
		public BloodBankShop updateBloodBankShop(@RequestBody BloodBankShop bloodBankShop, @PathVariable int id) {
		
			BloodBankShop newbloodBankShop= bloodBankShop;
				
			bloodBankShop=bloodBankShopService.getBloodBankShopById(id);
			bloodBankShop.setBbarea(newbloodBankShop.getBbarea());
			bloodBankShop.setBbcity(newbloodBankShop.getBbcity());
			bloodBankShop.setBbAddress(newbloodBankShop.getBbAddress());
			bloodBankShop.setBbName(newbloodBankShop.getBbName());
			bloodBankShop.setBbNumber(newbloodBankShop.getBbNumber());
			bloodBankShopService.saveOrUpdate(bloodBankShop);
				return bloodBankShopService.getBloodBankShopById(id);
		 }
			
			
		@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE)
		public List<BloodBankShop> deleteById(@PathVariable(value="id") int id) {
			bloodBankShopService.delete(id);
			return bloodBankShopService.getAllbloodbank();
		}

}
