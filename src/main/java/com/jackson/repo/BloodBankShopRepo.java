package com.jackson.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jackson.dto.SearchResponse;
import com.jackson.model.BloodBankShop;

@Repository
public interface BloodBankShopRepo extends JpaRepository <BloodBankShop, Integer>{
	public List<BloodBankShop> findBybbName(String bbname);
	
	// @Query("SELECT (bbs.bbAddress bbs.bb24h bbs.city bbs.area bb.type FROM BloodBankShop bbs JOIN BloodBank bb WHERE u.id = ?1")
//@Query("Select * from A a  left join B b on a.id=b.id")
	 // @Query("select c from BloodBankShop c where c.bbName like %?1")
	//@Query("SELECT new com.roytuts.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
	//		+ "FROM Department d LEFT JOIN d.employees e")
	
	//public List<BloodBankShop> request();	
    }
