package test.main;

import test.dao.PostDao;
import test.dto.PostDto;

public class QuizMain02 {

	public static void main(String[] args) {
		// POSTS 테이블에 데이터 UPDATE - 수정 하기
		int id = 4;// 그 게시글의 아이디
		String title = "집에가자";
		String content = "오늘은 공부한다!";
		
		PostDto dto = new PostDto();
		dto.setId(id);
		dto.setTitle(title);
		dto.setContent(content);
		
		var isSuccess = new PostDao().update(dto);
		if(isSuccess) System.out.println("UPDATE 성공");
		else System.out.println("UPDATE 실패");
	}

}
