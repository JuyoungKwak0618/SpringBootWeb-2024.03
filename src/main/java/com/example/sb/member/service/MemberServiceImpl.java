package com.example.sb.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.sb.member.Dao.MemberDao;
import com.example.sb.member.entity.Member;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired MemberDao mDao;
	
	@Override
	public List<Member> getMemberList() {
		return mDao.getMemberList();
	}

	@Override
	public void registerMember(Member member) {
		mDao.insertMember(member);
	}

}
