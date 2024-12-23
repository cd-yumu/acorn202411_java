package test.main;


import java.util.ArrayList;
import java.util.List;
import test.mypac.Member;

public class MainClass05 {

	public static void main(String[] args) {
		
		// 1. Member 객체를 담을 ArrayList 객체를 생성해서 참조값을 members 라는 List type 지역 변수에 담기
		List<Member> members = new ArrayList<>();
		
		// 2. 3명의 회원 정보를 Member 객체에 담기 (객체 3개 생성)
		Member m1 = new Member();
		m1.num = 1;
		m1.name = "김구라";
		m1.addr = "노량진";
		
		Member m2 = new Member(2, "해골", "행신동");
				
		members.add(m1);
		members.add(m2);
		members.add(new Member(3, "원숭이", "상도동"));
		
		
		// 3. 생성된 members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로 출력(반복문 사용)
		for(int i = 0 ; i < members.size() ; i++) {
			int num = members.get(i).num;
			String name = members.get(i).name;
			String addr = members.get(i).addr;
			System.out.println("번호: " + num + " 이름: " + name + "주소: " + addr);	
		}
		
		for(Member tmp:members) {
			String info = String.format("번호: %d, 이름: %s, 주소: %s",tmp.num, tmp.name, tmp.addr);
			System.out.println(info);
		}

	}

}
