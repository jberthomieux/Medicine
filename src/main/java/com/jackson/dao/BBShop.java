package com.jackson.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jackson.model.BloodBankShop;


@Repository
public interface BBShop extends CrudRepository<BloodBankShop, Long>{
	BloodBankShop findBloodBankShopBybbName(String bbName);
}
