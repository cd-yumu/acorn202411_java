package test.mypac;

// 가상의 옛날 가정용 전화기 객체를 생성할 설계도라고 가정

public class Phone { // extends 예약어가 없으면 자동으로 extends Object 된다.
	// 생성자
	public Phone() {
		System.out.println("Called Phone Constructor");
	}
	
	// 전화 거는 메소드
	public void call() {
		System.out.println("Calling!");
	}
}

//Phone 에는 extends 가 없어보이지만 자동으로 extends가 된다.
//java.lang패키지에 Object 클래스가 extends 되었다.