//package com.jackson.repo;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import com.jackson.dto.SearchResponse;
//import com.jackson.model.BloodBankShop;
//
//public interface QueryRepo extends JpaRepository <SearchResponse, Integer>{
//	@Query("select b FROM BloodBank b")
//	public List<SearchResponse> queryResponse();
//}
