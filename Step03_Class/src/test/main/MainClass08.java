package test.main;

import java.io.PrintStream;

public class MainClass08 {
	
	// static 필드
	public static String myName = "김구라";
	// non-static 필드
	public String yourName = "에이콘";
	

	public static void main(String[] args) {
		// System 클래스의 out 이라는 static 필드에는 
		// 콘솔창에 출력하는 기능을 가지고 있는 PrintStream type 의 참조값이 들어 있다.
		
		PrintStream a = System.out;  // PrintStream type이다.
		a.println("오잉");
		
		System.out.println(MainClass08.myName);
		System.out.println(myName);
		
		// yourName 은 static 필드가 아니라 참조가 안된다.
		// System.out.println(MainClass08.yourName);
		
		// 여기는 static 메소드 안 쪽이기 때문에 this. 을 사용할 수가 없다.
		// System.out.println(this.yourName);
		
//		System.
//		public class System{
//			public static final PrintStream out; //final -> read only / 상수
//		}
		
		long time = System.currentTimeMillis(); 
//		long 타입을 리턴해주는 static 메소드
//		1970년 1월 1일 0시를 기준으로 현재까지 경과한 시간을 1/1000 초 단위로 계산해 리턴
		System.out.println("경과 시간: "+time);
		
		
		
		
		
		
		
		
		// yourName 참조가 가능할까?
//		System.out.println(MainClass08.yourName);
//		System.out.println(yourName);
//		System.out.println(this.yourName); 
//		static은 객체와 상관 없어서 this 사용 불가
//		static 메소드 안에서는 static 자원 밖에 못쓴다. 왜? 같은 공간에 있어야 하니깐
		
		
//		- 이미 만들어진 객체
//		public class System{
//			public static PrintStream out;
//		}
//		=>System.out (o) static 필드에 있어야 클래스 명에 점 찍어 바로 접근 가능 
//				
//				static 은 class 의 이름을 통해 찾아가고
//					하나의 클래스가 하나밖에 존재하지 못함 (싱글톤)
// 				heap 은 참조값으로 찾아감
//		
// 		- 직접 만든 객체
//		public class Car{
//			public String name;
//			public int price;
//		}
//		=> Car.name (x)

		
//		public class Test{
//			public static String name;
//			public static void doSomething() {
//				System.out.println(Test.name);
//				System.out.println(name);
//				*this 로 사용하지 않는다.
//			};
//		}
		
				
				
	}

}
