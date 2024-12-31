package test.main;

import test.dao.MemberDao;

public class MainClass16 {

	public static void main(String[] args) {
		/*
		 * MemberDao 객체를 이요해서 1 번 회원의 정보를 삭제
		 * 단, 성공 여부를 콘솔창에 출력
		 */
		
		var dao = new MemberDao();
		var isSuccess = dao.delete(1);
		if(isSuccess) System.out.println("삭제 성공");
		else System.out.println("삭제 실패");

	}

}
