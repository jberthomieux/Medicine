package com.jackson.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.model.MedicineShop;
import com.jackson.model.Member;
import com.jackson.repo.MedicineShopRepo;

@Service
public class MedicineShopService {
	@Autowired 	
	MedicineShopRepo repo; 	
	public List<MedicineShop> getAllMedicineShop() { 
		List<MedicineShop> list = new ArrayList<>(); 
		repo.findAll().forEach(medicine -> list.add(medicine));
		return list; 
		} 	
	
	public MedicineShop getMedicineShopById(int id) {
		return repo.findById(id).get(); 
		}	 	
	
	public void saveOrUpdate(MedicineShop medicineShop) { 
		repo.save(medicineShop); 	
		}	 
	
	public void delete(int id) { 
		repo.deleteById(id); 
		} 	 
	
	public void update(MedicineShop medicineShop,int id) { 
		repo.save(medicineShop); 
		}
}
