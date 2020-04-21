package com.jackson.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.model.*;
import com.jackson.service.*;


@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/medicine")
public class MedicineController {
@Autowired
private MedicineService medicineService;

//private Map map = new Map(Member);

//@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value="/medicines",method=RequestMethod.GET)
	public List<Medicine> listMember(){
		return medicineService.getAllMedicines();
	 }
	//@PreAuthorize("hasRole('USER')")
	@RequestMapping(value="/medicine/{id}",method= RequestMethod.GET)
	public Medicine getOne(@PathVariable(value="id") int id) {
		return medicineService.getMedicineById(id);
		}
	
	@RequestMapping(value="/add",method= RequestMethod.POST)
	public List<Medicine> saveMedicine(@RequestBody Medicine medicine) {
		medicineService.saveOrUpdate(medicine);
         return medicineService.getAllMedicines();
	}
	@RequestMapping(value="/medicinenanme/{name}",method=RequestMethod.GET)
	public List<Medicine> searchMedicineByName(@PathVariable(value="name") String name){
		return medicineService.getMedicineByName(name);
	 }
	
	@RequestMapping(value="/update/{id}",method= RequestMethod.PUT)
	public Medicine updateMedicine(@RequestBody Medicine medicine, @PathVariable int id) {

		Medicine newmedicine=medicine;
		
		medicine=medicineService.getMedicineById(id);
		//medicine.setLocation(newmedicine.getLocation());
		medicine.setName(newmedicine.getName());
		medicine.setPrice(newmedicine.getPrice());
		medicine.setQty(newmedicine.getQty());
		medicineService.saveOrUpdate(medicine);
		return medicineService.getMedicineById(id);
		
    }
		
	@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE)
	public List<Medicine> deleteById(@PathVariable(value="id") int id) {
		medicineService.delete(id);
		return medicineService.getAllMedicines();
	}
}

