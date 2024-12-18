package test.main;

import test.mypac.Car;

public class MainClass04 {

	public static void main(String[] args) {
		// Car 객체를 생성해서 참조값을 얻어낸 다음
		Car car1 = new Car();
		car1.name = "소나타";
		
		Car car2 = new Car();
		car2.name = "그랜저";

		// 참조값에 . 찍어서 메소드 호출할 수 있다.
		car1.drive();
		car2.drive();
		// 메소드는 참조할 수 없다. 호출만 할 수 있다.
		// 메소드는 데이터가 아니다.
		// 메소드를 호출하면 반드시 리턴값이 있는것은 아니다.
		// void 어떤 값도 돌아오지 않는다는 의미
		
		// 현재 만든 메소드는 가상의 기능이다.
		// 해당 메소드가 탐이 나서 클래스 객체를 생성할 수 있다.
		// 이런 작업을 할 때는 어떤 객체의 도움을 받아야 하는지
		// java.lang 패키지 안에 있는 메소드는 따로 임포트 하지 않아도 쓸 수 있다.
		

		//String 도 객체다.
		//String name = new String() 도 가능하지만 불편하니 간략하게 써도 가능하도록 제공
		String name = "kim";
		String name2 = new String();
		//name. 하면 메소드가 많다.
		
		
	}

}
