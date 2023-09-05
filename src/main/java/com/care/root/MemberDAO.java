package com.care.root;

import org.springframework.stereotype.Repository;

@Repository("d123")
public class MemberDAO {
	public MemberDAO() {
		System.out.println("memberDAO");
	}
	public void test() {
		System.out.println("dao test ½ÇÇà");
	}
	public MemberDTO result() {
		System.out.println("dao ¸®Á©Æ®");
		MemberDTO dto = new MemberDTO();
		dto.setId("aaa");
		dto.setName("È«±æµ¿");
		return dto;
	}
}
