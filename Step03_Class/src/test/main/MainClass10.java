package test.main;

import test.mypac.Member;

public class MainClass10 {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.num(1);
		m1.name("김구라");
		m1.addr("노량진");
		
		Member m2 = new Member().num(2).name("해골").addr("행신동");
		
		Member m3 = new Member().num(3).name("원숭이").addr("분당");
//		해당 메소드에서 this 를 리턴했기 때문에
//		동작 후 this(Member type)가 리턴되기 때문에
//		이런 동작이 가능하다
		
		System.out.println(m1);

	}

}
