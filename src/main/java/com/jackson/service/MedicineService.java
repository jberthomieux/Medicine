package com.jackson.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.jackson.dto.BbSearchResponse;
import com.jackson.dto.MsSearchResponse;
import com.jackson.model.Medicine;
import com.jackson.model.MedicineShop;
import com.jackson.model.Member;
import com.jackson.repo.MedicineRepo;
import com.jackson.repo.MedicineShopRepo;

import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

@Service(value = "medicineService") 
public class MedicineService {
	@Autowired 	
	MedicineRepo repo; 	
	@Autowired
	MedicineShopRepo shoprepo;
	public List<Medicine> getAllMedicines() { 
		List<Medicine> list = new ArrayList<>(); 
		repo.findAll().forEach(medicine -> list.add(medicine));
		return list; 
		} 	
	
	public Medicine getMedicineById(int id) {
		return repo.findById(id).get(); 
		}	 	
	
	public void saveOrUpdate(Medicine medicine,int id) { 
		MedicineShop med=shoprepo.findById(id).get();
		med.getMedicines().add(medicine);
		shoprepo.save(med);	
		}	 
	public List<MsSearchResponse> searchResult(String type){
		return repo.queryResponse(type);
	}
	public void delete(int id) { 
		repo.deleteById(id); 
		} 	 
	
	public void update(Medicine medicine,int id) { 
		repo.save(medicine); 
		}
	public List<Medicine> getMedicineByName(String name) {
    	return repo.findByName(name);
    }
 
	} 