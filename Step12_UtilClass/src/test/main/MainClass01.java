package test.main;

import java.util.ArrayList;

public class MainClass01 {

	public static void main(String[] args) {
		// java 에서 배열은 용도가 한정되어 있다. item을 담을 수 있는 공간을 늘이거나 줄일 수 있다.
		
		// 문자열(String) type 을 담을 수 있는 방 5개 짜리 배열 객체 생성
		String[] names = new String[5];
		names[0] = "김구라";
		names[1] = "해골";
		names[2] = "원숭이";
		
		ArrayList<String> friends = new ArrayList<>();
		// 김구라, 해골, 원숭이 를 순서대로 담아보세요.
//		friends.add("김구라");
		friends.add(0, "김구라");
		friends.add(1, "해골");
		friends.add(2, "원숭이");
		
		// 0 번 방의 아이템을 불러와서 item 이라는 변수에 담기
		String item = friends.get(0);
		
		// 1 번 방의 아이템을 삭제
		friends.remove(1);
		
		// 0 번 방에 "에이콘"을 끼워넣기
		friends.add(0, "acorn");
		
		// 저장된 아이템의 갯수(size) 를 size 라는 지역 변수에 담기
		int size = friends.size();
		
		// 저장된 모든 아이템 전체 삭제
		friends.removeAll(friends);
		friends.clear();
	}

}
