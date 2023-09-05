package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	//@Autowired
	//memberDAO ù��° ���ڸ� �ҹ��ڷ� �ؼ� �����, ddd 
	@Inject
	@Qualifier("ddd") //ddd��� ����
	MemberDAO dao; //���⿡ �����ϰڴ�(����Ʈ�� �������̾� ���� ��)
	
	public MemberService() {
		System.out.println("service");
	}
	
	public void test() {
		System.out.println("svr test����");
		dao.test();
	}
	public MemberDTO result() {
		System.out.println("���� ����Ʈ");
		return dao.result(); //dao�� ����
	}
}

