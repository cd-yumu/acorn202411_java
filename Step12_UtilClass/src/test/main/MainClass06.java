package test.main;

import java.util.ArrayList;

import test.mypac.MemberDto;

public class MainClass06 {

	public static void main(String[] args) {
		
		// 1. MemberDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역 변수에 담기
		ArrayList<MemberDto> members = new ArrayList<>();
		
		// 2. 3명의 회원 정보를 MemberDto 객체에 담기 (MemberDto 객체가 3개 생성)
		MemberDto m1 = new MemberDto();
		m1.setNum(1);
		m1.setName("김구라");
		m1.setAddr("노량진");
		
		MemberDto m2 = new MemberDto();
		m2.setNum(2);
		m2.setName("해골");
		m2.setAddr("행신동");
		
		MemberDto m3 = new MemberDto();
		m3.setNum(3);
		m3.setName("원숭이");
		m3.setAddr("상도동");
		
		
		// 3. 위에서 생성된 MemberDto 객체의 참조값을 ArrayList 객체에 모두 담기
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		// 4. 반복문을 이용해서 members 에 들어있는 회원 정보를 출력
		for(MemberDto tmp: members) {
			String info = String.format("번호: %d, 이름: %s, 주소: %s", tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println(info);
		}
		
		// call test method (매개변수에 전달한 String type의 갯수는 유동적이다.)
		test();
		test("kim");
		test("kim", "lee", "park");
	}
	
	
	// ... TEST
	public static void test(String... msgs) {
		// String... 은 String[] type 이다.
		String[] a = msgs; 
	}

}