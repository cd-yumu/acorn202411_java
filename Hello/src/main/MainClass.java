package main;

/*
 * eclipse 에서 진한 빨강색으로 표시되는 단어는 예약어 이다.
 * 예약어는 아주 특별히 해석되기로 약속된 단어이기 때문에 
 * 식별자(클래스명, 메소드명, 변수명 등등) 으로 사용할 수 없다.
 */


public class MainClass {
	public static void main(String[] args) {  // static main method
		
		System.out.println("Hello, world!"); //console.log()
		System.out.println("김구라, 세상!");
		
		//(js) let num = 1; 
		int num = 1;
		
		//(js) let name = "김구라", '김구라', `김구라`;
		String name = "김구라";
		
		//(js) let isMan = true;
		boolean isMam = true;
		
		// java 는 정적 타이핑, javascript 는 동적 타이핑이다.
		// method 안에 변수를 선언 했음으로 지역변수다 local 
		// 지역 변수를 선언 할 때 type 을 선언해줘야 한다? 지역 변수만??
		
		// java 에서는 타입을 직접 만들어 낼 수도 있기때문에 java 에서 타입의 개수는 무한대에 라고 할 수 있다.
		
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println(i);
		}
		
		
		// java는 텍스트 문서를 실행할 수 없기 때문에 compile 을 해야한다. 컴퓨터가 이해할 수 있도록
		
		
	}
}
