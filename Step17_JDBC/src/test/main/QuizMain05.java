package test.main;

import test.dao.PostDao;
import test.dto.PostDto;

public class QuizMain05 {

	public static void main(String[] args) {
		// POSTS 테이블에 데이터 SELECT ONE 하기
		int id = 2 ;// 검색할 그 게시글의 아이디
		
		PostDto dto = new PostDao().getData(id);
		
		if(dto != null)
			System.out.printf("%d, %s, %s", dto.getId(), dto.getTitle(), dto.getContent());
		else System.out.println("해당 게시글은 존재하지 않습니다.");

	}

}
