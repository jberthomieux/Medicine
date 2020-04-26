package com.jackson.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jackson.dto.MsSearchResponse;
import com.jackson.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository <Medicine, Integer>{
	public List<Medicine> findByName(String name);
	@Query(value="SELECT new com.jackson.dto.MsSearchResponse (m.name,ms.medshopAddress,ms.medarea,m.price,m.qty) FROM MedicineShop ms JOIN ms.medicines m where m.name=?1")
	 public List<MsSearchResponse> queryResponse(String name);
}