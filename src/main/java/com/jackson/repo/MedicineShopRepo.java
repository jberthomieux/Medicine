package com.jackson.repo;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import com.jackson.dto.MedSearchResponse;
import com.jackson.model.MedicineShop;
import com.jackson.model.Member;
@Repository
public interface MedicineShopRepo extends JpaRepository <MedicineShop, Integer>{
	public List<MedicineShop> findByMedshopName(String medshopName);
	//@Query(value="SELECT new com.jackson.dto.SearchResponse(bbs.bbarea, b.price) FROM BloodBankShop bbs JOIN bbs.bloodbanks b", nativeQuery = true)
	//public List<SearchResponse> queryResponse();
}
