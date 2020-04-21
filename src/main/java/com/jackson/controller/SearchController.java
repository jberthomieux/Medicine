//package com.jackson.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.jackson.dto.BloodBankRequest;
//import com.jackson.dto.SearchResponse;
//import com.jackson.model.BloodBankShop;
//import com.jackson.repo.BloodBankRepo;
//import com.jackson.repo.BloodBankShopRepo;
//
//@RestController
//public class SearchController {
//
//	@Autowired
//	private BloodBankRepo bbrepo;
//	@Autowired
//	private BloodBankShopRepo bbsrepo;
//	
//	@PostMapping("/addbb")
//	public BloodBankShop addShop(@RequestBody BloodBankRequest request) {
//		return bbsrepo.save(request.getBbshop());
//	}
//	
//	@GetMapping("/allbbs")
//	public List<BloodBankShop> findAllBBS(){
//		return bbsrepo.findAll();
//	}
//	@GetMapping("/findbb")
//	public List<BloodBankShop> findBBAndLocation(){
//		return bbsrepo.request();
//    }
//}
