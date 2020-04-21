package com.jackson.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jackson.model.BloodBank;

@Repository
public interface BloodBankRepo extends JpaRepository <BloodBank, Integer>{
	public List<BloodBank> findByType(String type);
	}

