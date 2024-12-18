package test.main;

import test.mypac.Car;

public class MainClass01 {
	// run 했을 때 실행의 흐름이 시작되는 main() 메소드
	public static void main(String[] args) {
		// Car 클래스로 객체를 생성하고 그 객체의 참조값을 c1 이라는 지역변수에 담기
		Car c1 = new Car();
	
		// 그냥 Car() 하면 뭔지 모르기 때문에 구체적으로 알려줘야 함
		// 따라서 패키지명을 앞에 연결해줘야 한다. -> new test.mypac.Car()
		// 또는 해당 패키지를 import 해준다. -> import test.mypac.Car;
		
		// Car 클래스로 객체를 생성하고 그 객체의 참조값을 c2 이라는 지역변수에 담기
		Car c2 = new Car();
		
		// Car 클래스로 객체를 생성하고 그 객체의 참조값을 c3 이라는 지역변수에 담기
		Car c3 = new Car();
		
	}
}
