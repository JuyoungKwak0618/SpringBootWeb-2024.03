package com.example.sb.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sb.member.entity.Member;
import com.example.sb.member.service.MemberService;

@Controller
@RequestMapping("exam/member")
public class ExamController {
	@Autowired private MemberService Msvc;
	
	@GetMapping("/list") 
	public String memberList(Model model) {
		List<Member> list = Msvc.getMemberList();
		model.addAttribute("memberList",list);
		return "memberList";
	}
	

	@GetMapping("/insert")
	public String insertform() {
		return "insert";
	}
	
	@PostMapping("/insert")
	public String insertProc(int mid, String name, int age, String country, Model model) {
		Member Member = new Member(mid, name, age , country);
		Msvc.registerMember(Member);
		return "insert";
	}
}
