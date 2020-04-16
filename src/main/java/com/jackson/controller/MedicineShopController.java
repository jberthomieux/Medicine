package com.jackson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.model.MedicineShop;
import com.jackson.model.Member;
import com.jackson.service.MedicineShopService;
import com.jackson.service.MemberService;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/mshop")
public class MedicineShopController {
	@Autowired
	private MedicineShopService medicineShopService;

	//@PreAuthorize("hasRole('ADMIN')")
		@RequestMapping(value="/members",method=RequestMethod.GET)
		public List<MedicineShop> listMember(){
			return medicineShopService.getAllMedicineShop();
		 }
		//@PreAuthorize("hasRole('USER')")
		@RequestMapping(value="/member/{id}",method= RequestMethod.GET)
		public MedicineShop getOne(@PathVariable(value="id") int id) {
			return medicineShopService.getMedicineShopById(id);
			}
		
		@RequestMapping(value="/add",method= RequestMethod.POST)
		public List<MedicineShop> saveMedicineShop(@RequestBody MedicineShop medicineShop) {
			medicineShopService.saveOrUpdate(medicineShop);
	         return medicineShopService.getAllMedicineShop();
		}
		@RequestMapping(value="/update",method= RequestMethod.PUT)
		public MedicineShop updateMember(@RequestBody MedicineShop medicineShop, int id) {
			medicineShopService.update(medicineShop,id);
	         return medicineShopService.getMedicineShopById(id);
		}
			
		@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE)
		public List<MedicineShop> deleteById(@PathVariable(value="id") int id) {
			medicineShopService.delete(id);
			return medicineShopService.getAllMedicineShop();
		}

}
