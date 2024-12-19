package test.main;

import test.util.MyUtil;

public class MainClass09 {

	public static void main(String[] args) {
		// 부모클래스에 정의된 기능도 사용할 수 있다.
		MyUtil.clear();
		MyUtil.send();
		// 자식 클래스에 정의된 기능
		MyUtil.light();
		
		// 상속 받으면 static 메소드도 같이 와서 사용 가능

	}

}
