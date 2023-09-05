package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	//@Autowired
	//memberDAO 첫번째 글자를 소문자로 해서 만든다, ddd 
	@Inject
	@Qualifier("ddd") //ddd라는 빈을
	MemberDAO dao; //여기에 주입하겠다(인젝트랑 쿼리파이어 같이 씀)
	
	public MemberService() {
		System.out.println("service");
	}
	
	public void test() {
		System.out.println("svr test연동");
		dao.test();
	}
	public MemberDTO result() {
		System.out.println("서비스 리절트");
		return dao.result(); //dao로 연결
	}
}

