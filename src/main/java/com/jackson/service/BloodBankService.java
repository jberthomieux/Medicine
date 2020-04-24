package com.jackson.service;

import java.util.ArrayList;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.dto.BbSearchResponse;
import com.jackson.model.BloodBank;
import com.jackson.model.BloodBankShop;

import com.jackson.repo.BloodBankRepo;
import com.jackson.repo.BloodBankShopRepo;

@Service 
public class BloodBankService {
	@Autowired 	
	BloodBankRepo repo; 
	@Autowired
	BloodBankShopRepo shoprepo;
	public List<BloodBank> getAllBloodBanks() { 
		List<BloodBank> list = new ArrayList<>(); 
		repo.findAll().forEach(bloodBank -> list.add(bloodBank));
		return list; 
		} 	
	
	public BloodBank getBloodBankById(int id) {
		return repo.findById(id).get(); 
		}	 
	
	public List<BbSearchResponse> searchResult(String type){
		return repo.queryResponse(type);
	}
	
	public void saveOrUpdate(BloodBank bloodBank,int id) { 
		BloodBankShop blood=shoprepo.findById(id).get();
		blood.getBloodbanks().add(bloodBank);
		shoprepo.save(blood);		
		}	 
	
	public void delete(int id) { 
		repo.deleteById(id); 
		} 	 
	
//	public void update(BloodBank bloodBank,int id){ 
//		repo.save(bloodBank); 
//		}
	
	 public List<BloodBank> getBloodBankByType(String type) {
	    	return repo.findByType(type);
	    }
	
	} 