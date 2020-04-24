package com.jackson.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.jackson.model.MedicineShop;
import com.jackson.model.Member;
import com.jackson.repo.MedicineShopRepo;

@Service(value ="medicineShopService")
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
	public List<MedicineShop> getMedicineShopByName(String name) {
    	return repo.findByMedshopName(name);
    }

	/*
	 * public Page<Medicine> findCustomersByFirstName(
	 * 
	 * @Or({
	 * 
	 * @Spec(path = "names.firstName", params = "name", spec = Like.class),
	 * 
	 * @Spec(path = "names.lastName", params = "name", spec = Like.class),
	 * 
	 * @Spec(path = "names.nickName", params = "name", spec = Like.class) })
	 * Specification<Customer> customerSpec, Pageable pageable) {
	 * 
	 * return customerRepo.findAll(customerSpec, pageable); }
	 */
}
