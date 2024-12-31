package test.main;

import test.dao.PostDao;
import test.dto.PostDto;

public class QuizMain03 {

	public static void main(String[] args) {
		// POSTS 테이블에 데이터 DELETE 하기
		int id = 4 ; // 삭제할 그 게시글의 아이디
		
		var isSuccess = new PostDao().delete(id);
		if(isSuccess) System.out.println("DELETE 성공");
		else System.out.println("DELETE 실패");
	}

}
