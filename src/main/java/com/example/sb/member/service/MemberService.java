package com.example.sb.member.service;

import java.util.List;

import com.example.sb.member.entity.Member;

public interface MemberService {

	List<Member> getMemberList();
	
	void registerMember(Member member);
	
}
