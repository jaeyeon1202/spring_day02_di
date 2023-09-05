package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired
	private MemberService ms; //서비스로 연결하기 위해 객체 하나 생성
	
	public MemberController() {
		System.out.println("controller");
	}
	
	@GetMapping("/index") //url경로
	public String index() {
		System.out.println("ms:"+ms);
		ms.test(); 
		return "index"; //views -> jsp 경로
	}
	@GetMapping("/result")
	public String result(Model model) {
		System.out.println("컨트롤러 result 실행");
		//ms.result(); //서비스 리절트로 연결
		model.addAttribute("member", ms.result());
		return "result";
	}
	
}





