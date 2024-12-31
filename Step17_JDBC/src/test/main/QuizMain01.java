package test.main;

import test.dao.PostDao;
import test.dto.PostDto;

public class QuizMain01 {
	

	public static void main(String[] args) {
		// POSTS 테이블에 데이터 INSERT 하기
		String title = "집에가자";
		String content = "오늘은 게임한다!";
		
		PostDto dto = new PostDto();
		dto.setTitle(title);
		dto.setContent(content);
		
		var isSuccess = new PostDao().insert(dto);
		if(isSuccess) System.out.println("INSERT 성공");
		else System.out.println("INSERT 실패");

	}

}
