package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {

	public static void main(String[] args) {
		
		// Generic Class를 Apple로 지정해서 객체 사용하기
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		box1.pack(null);
		
		// Generic Class를 Orange로 지정해서 객체 사용하기
		FruitBox<Orange> box2 = new FruitBox<Orange>();
		box2.unPack();
		
		// Generic 클래스를 Melon 으로 지정해서 객체 사용하시
		// 객체 생성시에 Generic 은 생략 가능하다
		FruitBox<Melon> box3 = new FruitBox<>();
		box3.pack(new Melon());
		Melon m1 = box3.unPack();
	}

}
