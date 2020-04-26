package com.jackson.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.jackson.dto.BbSearchResponse;
import com.jackson.model.BloodBankShop;
//import com.jackson.model.BloodBank;
import com.jackson.model.User;
import com.jackson.repo.BloodBankShopRepo;

@Service(value ="bloodBankShopService")
public class BloodBankShopService {
	@Autowired 	
	BloodBankShopRepo repo; 	
	
	//QueryRepo rep;
		
	public List<BloodBankShop> getAllbloodbank() { 
		List<BloodBankShop> list = new ArrayList<>(); 
		repo.findAll().forEach(bbs -> list.add(bbs));
		return list; 
		} 	
	
	public BloodBankShop getBloodBankShopById(int id) {
		return repo.findById(id).get(); 
		}	 	
	
	public void saveOrUpdate(BloodBankShop bloodBankShop) { 
		repo.save(bloodBankShop); 	
		}	 
	
	public void delete(int id) { 
		repo.deleteById(id); 
		} 	 
	
	public void update(BloodBankShop bloodBankShoop,int id) { 
		repo.save(bloodBankShoop); 
		} 
	 public List<BloodBankShop> getBloodBankShopByName(String name) {
	    	return repo.findBybbName(name);
	    }
}
