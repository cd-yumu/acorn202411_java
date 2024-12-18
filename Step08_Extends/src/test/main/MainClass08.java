package test.main;

import test.mypac.AndroidPhone;
import test.mypac.Phone;

public class MainClass08 {

	public static void main(String[] args) {
		// 여기서 아래의 usePhone() 메소드를 호출하는 code 를 작성하고 run 해서 결과를 확인해 보세요
		MainClass08.usePhone(new Phone());
		
		usePhone(new AndroidPhone()); // 자식 객체는 부모 타입에 자연스레 담긴다.
	}

	// static Method (이 메소드를 호출하기 위해서는 Phone type 의 참조값이 필요하다)
	public static void usePhone(Phone p) {
		// 매개 변수에 전달 된 값을 이용해서 매소드를 호출하는 code
		p.call();
	}
}