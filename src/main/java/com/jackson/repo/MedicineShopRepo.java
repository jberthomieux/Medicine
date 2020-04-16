package com.jackson.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jackson.model.MedicineShop;
@Repository
public interface MedicineShopRepo extends JpaRepository <MedicineShop, Integer> {

}
