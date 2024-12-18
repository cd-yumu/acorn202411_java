package test.main;

import test.mypac.Car;
import test.mypac.Eat;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * Car 객체를 3개 만들어서
		 * 임의의 자동자 이름과 가격을 필드에 각각 대입하는 코드를 작성해 보세요
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.name = "기아차";
		car2.name = "현대차";
		car3.name = "테슬라";
		
		car1.price = 100;
		car2.price = 200;
		car3.price = 300;
		
		
		/*
		 * 다 한 사람은 자신만의 클래스를 test.mypac 패키지에 만들어 놓고 테스트하는 코드 작성
		 */
		Eat eat1 = new Eat();
		
		eat1.name = "최유진";
		eat1.food = "오트밀우유, 초코마시멜로";
		
		Eat eat2 = new Eat();
		
		eat2.name = "최유진";
		eat2.food = "알약";
		eat2.price = 7500;
	}
}
