package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.PostDto;

public class MainClass14 {

	public static void main(String[] args) {
		/*  
		 * 1. test.mypac.PostDto 클래스를 만들어 보세요
		 *    PostDto 에는 글번호, 작성자, 제목을 담을수 있어야 합니다.
		 *    즉 3개의 필드를 만드세요
		 *    필드명은 마음데로, 필드의 data type 은 잘 생각해서 결정
		 *    dto 작성 규약에 맞게 만들어 주세요( eclipse generate 기능 활용)
		 *    test.mypac 페키지에 만들기 
		 * 
		 * 2. PostDto 객체에 임의의 글 3개의 정보를 담아 보세요. 
		 *    총 3개의 PostDto 객체가 생성이 되어야 합니다.
		 * 
		 * 3. PostDto 객체를 담을수 있는 ArrayList 객체를 생성해서 위에서 생성한 PostDto 
		 *    객체를 ArrayList 에 담아 보세요.
		 *    
		 * 4. 반복문 돌면서 ArrayList 에 담긴 글 목록을 콘솔창에 이쁘게 출력해 보세요.
		 *  
		 */
		
//		PostDto p1 = new PostDto();
//		p1.setNo(1);
//		p1.setWriter("김구라");
//		p1.setTitle("공부하세요");
//		
//		PostDto p2 = new PostDto();
//		p2.setNo(2);
//		p2.setWriter("해골");
//		p2.setTitle("해골물을 마셔버림");
//		
//		PostDto p3 = new PostDto();
//		p3.setNo(3);
//		p3.setWriter("원숭이");
//		p3.setTitle("동물원 탈출");
		
		PostDto p1 = new PostDto(1, "김구라", "공부하세요");
		PostDto p2 = new PostDto(2, "해골", "해골물을 마셔버림");
		PostDto p3 = new PostDto(3, "원숭이", "동물원 탈출");
		
		List<PostDto> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for(PostDto tmp:list) {
			String post = String.format("=== \n글번호: %d \n작성자: %s \n제목: %s \n===", tmp.getNo(), tmp.getWriter(), tmp.getTitle());
			System.out.println(post);
		}
	}
}
