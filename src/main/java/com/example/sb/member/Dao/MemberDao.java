package com.example.sb.member.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.sb.member.entity.Member;



@Mapper
public interface MemberDao {

	@Select("SELECT * FROM member")
	List<Member> getMemberList();
	
	@Insert("insert into member values(#{mid}, #{name}, #{age}, #{country})")
	void insertMember(Member member);
}
