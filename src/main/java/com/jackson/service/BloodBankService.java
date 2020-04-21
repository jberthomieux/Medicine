package com.jackson.service;

import java.util.ArrayList;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.model.BloodBank;
import com.jackson.model.BloodBankShop;
import com.jackson.repo.BloodBankRepo;

@Service 
public class BloodBankService {
	@Autowired 	
	BloodBankRepo repo; 	
	public List<BloodBank> getAllBloodBanks() { 
		List<BloodBank> list = new ArrayList<>(); 
		repo.findAll().forEach(bloodBank -> list.add(bloodBank));
		return list; 
		} 	
	
	public BloodBank getBloodBankById(int id) {
		return repo.findById(id).get(); 
		}	 	
	
	public void saveOrUpdate(BloodBank bloodBank) { 
		repo.save(bloodBank); 	
		}	 
	
	public void delete(int id) { 
		repo.deleteById(id); 
		} 	 
	
	public void update(BloodBank bloodBank,int id) { 
		repo.save(bloodBank); 
		}
	 public List<BloodBank> getBloodBankByType(String type) {
	    	return repo.findByType(type);
	    }
 
	} 