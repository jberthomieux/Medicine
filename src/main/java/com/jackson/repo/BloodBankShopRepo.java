package com.jackson.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jackson.model.BloodBankShop;
@Repository
public interface BloodBankShopRepo extends JpaRepository <BloodBankShop, Integer>{
		}


