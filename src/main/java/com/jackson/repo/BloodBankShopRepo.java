package com.jackson.repo;

import java.util.List;
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
	@Query(value="SELECT new com.jackson.dto.BdSearchResponse (bbs.bbarea,bbs.bbAddress,b.price,b.type) FROM BloodBankShop bbs JOIN bbs.bloodbanks b where b.type=?1", nativeQuery = true)
	 public List<BbSearchResponse> queryResponse(String Type);	
    }
