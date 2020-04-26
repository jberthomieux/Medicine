package com.jackson.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jackson.dto.BbSearchResponse;
import com.jackson.model.BloodBank;

@Repository
public interface BloodBankRepo extends JpaRepository <BloodBank, Integer>{
	public List<BloodBank> findByType(String type);
	@Query(value="SELECT new com.jackson.dto.BbSearchResponse (b.type,b.price,bbs.bbarea,bbs.bbAddress,b.qty) FROM BloodBankShop bbs JOIN bbs.bloodbanks b where b.type=?1")
	 public List<BbSearchResponse> queryResponse(String type);
	}

