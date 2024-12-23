package test.main;

import java.util.ArrayList;import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {

	public static void main(String[] args) {
		//1. Car type 을 저장할 수 있는 ArrayList 객체를 생성해서 참조값을 List 인터페이스 type 지역변수 cars 에 담아
		ArrayList<Car> cars = new ArrayList<Car>();
		
		// 2. Car 객체 (3개) 를 생성해서 ArrayList 객체에 저장
		cars.add(new Car("소나타"));
		cars.add(new Car("그랜저"));
		cars.add(new Car("아반떼"));
		
		// 3. 일반 for 문을 이용해서 ArrayList 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
		System.out.println("-- 일반 for 문 --");
		for(int i = 0 ; i < cars.size() ; i++) {
			Car tmp = cars.get(i);
			tmp.drive();
//			cars.get(i).drive(); 	// (O)
		}
		
		
		// 4. 확장 for 문을 이용해서 ArrayList 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
		System.out.println("-- 확장 for 문 --");
		for(Car tmp : cars) {
			tmp.drive();
		}
		
		// 5. ArrayList 객체의 forEach() 메소드를 이용해서 ArrayList 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
		System.out.println("-- forEach 메소드 사용 1 --");
		Consumer<Car> con = new Consumer<Car>() {
			@Override
			public void accept(Car t) {
				t.drive();				
			}
		};
		cars.forEach(con);
		
		System.out.println("-- forEach 메소드 사용 2 --");
		Consumer<Car> con2 = (t) -> {t.drive();};
		cars.forEach(con2);
		
		System.out.println("-- forEach 메소드 사용 3 --");
		cars.forEach((t)->{t.drive();});
	}

}
