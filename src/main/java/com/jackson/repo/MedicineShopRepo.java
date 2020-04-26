package com.jackson.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.jackson.model.MedicineShop;
@Repository
public interface MedicineShopRepo extends JpaRepository <MedicineShop, Integer>{
	public List<MedicineShop> findByMedshopName(String medshopName);
}
