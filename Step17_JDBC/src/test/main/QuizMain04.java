package test.main;

import java.util.List;

import test.dao.PostDao;
import test.dto.PostDto;

public class QuizMain04 {

	public static void main(String[] args) {
		// POSTS 테이블에 데이터 SELECT ALL 하기
		List<PostDto> list = new PostDao().getList();
		
		for(PostDto tmp:list)
			System.out.printf("%d, %s, %s \n", tmp.getId(), tmp.getTitle(), tmp.getContent());	
	}

}
