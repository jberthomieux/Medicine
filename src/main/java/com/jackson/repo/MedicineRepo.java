package com.jackson.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jackson.model.Medicine;
import com.jackson.model.MedicineShop;

@Repository
public interface MedicineRepo extends JpaRepository <Medicine, Integer>{
	public List<Medicine> findByName(String name);
	}