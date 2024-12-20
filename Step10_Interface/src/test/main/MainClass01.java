package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {

	public static void main(String[] args) {
		/*
		 * Remocon 인터페이스는 data type 의 역할을 할 수 있는데 
		 * 해당 type 의 참조값을 얻어내기 위해서는 인터페이스를 구현한 클래스로
		 * 객체 생성을 하면 된다.
		 */ 
//		추상 클래스(단일 상속)와 비슷이지만 인터페이스는 여러개를 상속할 수 있다는 점이 다르다
		Remocon r1 = new MyRemocon();
		r1.up();
		r1.down();
		
		// Remocon 인터페이스에 정의된 static final 상수 참조
		String result = Remocon.COMPANY;
		
		// 상수이기 때문에 수정 불가
		// Remocon.COMPANY = "SAMSUNG";
	}

}

//class 나 implements 공인중계사, 정보처리기사, 회계사{
//	
//}
//
//공인중계사 [] =  new 나();