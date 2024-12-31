package test.main;

import test.dao.MemberDao;
import test.dto.MemberDTO;

public class MainClass15 {

	public static void main(String[] args) {
		/*
		 * MemeberDao 객체를 이용해서 
		 * 1번 회원의 이름을 "김구라" 주소를 "노량진" 으로 수정
		 */
		
		MemberDTO dto = new MemberDTO();
		dto.setNum(1);
		dto.setName("김구라");
		dto.setAddr("노량진");
		
		
		MemberDao dao = new MemberDao();
		boolean isSuccess = dao.update(dto);
		
		if(isSuccess) System.out.println("수정 성공");
		else System.out.println("수정 실패");

	}

}
