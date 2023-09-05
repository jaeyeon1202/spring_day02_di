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
	private MemberService ms; //���񽺷� �����ϱ� ���� ��ü �ϳ� ����
	
	public MemberController() {
		System.out.println("controller");
	}
	
	@GetMapping("/index") //url���
	public String index() {
		System.out.println("ms:"+ms);
		ms.test(); 
		return "index"; //views -> jsp ���
	}
	@GetMapping("/result")
	public String result(Model model) {
		System.out.println("��Ʈ�ѷ� result ����");
		//ms.result(); //���� ����Ʈ�� ����
		model.addAttribute("member", ms.result());
		return "result";
	}
	
}





