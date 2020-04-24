package com.jackson.repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jackson.dto.BbSearchResponse;
import com.jackson.model.BloodBank;
import com.jackson.model.BloodBankShop;

@Repository
public interface BloodBankShopRepo extends JpaRepository <BloodBankShop, Integer>{
	public List<BloodBankShop> findBybbName(String bbname);
	public BloodBankShop findByBloodbanks(BloodBank bloodbanks);
	//public List<BloodBankShop> findByType(type)
	//@Query("SELECT (bbs.bbAddress bbs.bb24h bbs.city bbs.area bb.type FROM BloodBankShop bbs JOIN BloodBank bb WHERE u.id = ?1")
//@Query("Select * from A a  left join B b on a.id=b.id")
	 // @Query("select c from BloodBankShop c where c.bbName like %?1")
	//@Query("SELECT new com.roytuts.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
	//		+ "FROM Department d LEFT JOIN d.employees e")
	// @Query("SELECT a FROM Author a WHERE firstName = ?1 AND lastName = ?2")
	//@Query("select bbs, b FROM BloodBankShop bbs JOIN bbs.bloodbanks b")
	 @Query(value="SELECT new com.jackson.dto.BdSearchResponse (bbs.bbarea,bbs.bbAddress,b.price,b.type) FROM BloodBankShop bbs JOIN bbs.bloodbanks b where b.type=?1", nativeQuery = true)
	 public List<BbSearchResponse> queryResponse(String Type);	
    }
