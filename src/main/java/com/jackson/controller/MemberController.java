//package com.jackson.controller;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.jackson.model.*;
//import com.jackson.service.*;
//
//
//@CrossOrigin(origins="*",maxAge=3600)
//@RestController
//@RequestMapping("/Member")
//public class MemberController {
//@Autowired
//private MemberService memberService;
//
////private Map map = new Map(Member);
//
////@PreAuthorize("hasRole('ADMIN')")
//	@RequestMapping(value="/members",method=RequestMethod.GET)
//	public List<Member> listMember(){
//		return memberService.getAllMembers();
//	 }
//	
//	@RequestMapping(value="/membername/{name}",method=RequestMethod.GET)
//	public List<Member> searchMemberByName(@PathVariable(value="name") String name){
//		return memberService.getMemberByName(name);
//	 }
//	//@PreAuthorize("hasRole('USER')")
//	@RequestMapping(value="/memberid/{id}",method= RequestMethod.GET)
//	public Member getOne(@PathVariable(value="id") int id) {
//		return memberService.getMemberById(id);
//		}
//	
//	@RequestMapping(value="/add",method= RequestMethod.POST)
//	public List<Member> saveMember(@RequestBody Member member) {
//         memberService.saveOrUpdate(member);
//         return memberService.getAllMembers();
//	}
//	
//	@RequestMapping(value="/update/{id}",method= RequestMethod.PUT)
//	public Member updateMember(@RequestBody Member member, @PathVariable int id) {
//
//		Member newmember=member;
//		
//		member=memberService.getMemberById(id);
//		member.setEmail(newmember.getEmail());
//		member.setName(newmember.getName());
//		member.setPassword(newmember.getPassword());
//		member.setType(newmember.getType());
//		member.setUsername(newmember.getUsername());
//		memberService.saveOrUpdate(member);
//		return memberService.getMemberById(id);
//		
//    }
//		
//	@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE)
//	public List<Member> deleteById(@PathVariable(value="id") int id) {
//		memberService.delete(id);
//		return memberService.getAllMembers();
//	}
//}
//
