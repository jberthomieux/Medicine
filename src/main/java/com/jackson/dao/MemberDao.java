package com.jackson.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jackson.model.Member;


@Repository
public interface MemberDao extends CrudRepository<Member, Long>{
	Member findMemberByName(String name);
}
