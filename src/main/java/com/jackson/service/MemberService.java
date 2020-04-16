package com.jackson.service;

import java.util.ArrayList;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.jackson.model.Member;

import com.jackson.repo.MemberRepo;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;
@Service 
public class MemberService {
	@Autowired 	
	MemberRepo repo; 	
	public List<Member> getAllMembers() { 
		List<Member> list = new ArrayList<>(); 
		repo.findAll().forEach(member -> list.add(member));
		return list; 
		} 	
	
	public Member getMemberById(int id) {
		return repo.findById(id).get(); 
		}	 	
	
	public void saveOrUpdate(Member member) { 
		repo.save(member); 	
		}	 
	
	public void delete(int id) { 
		repo.deleteById(id); 
		} 	 
	
	public void update(Member member,int id) { 
		repo.save(member); 
		}
 
	} 