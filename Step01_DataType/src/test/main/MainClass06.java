package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		// 상수 (Read Only) 를 만들때는 final 이라는 예약어를 type 선언 앞에 붙여주면 된다.
		// 관례상 상수를 만들때는 모두 대문자로 표기한다.
		final int MY_ID = 999;
		// 어떤 type 이든지 상관없이 상수로 만들 수 있다.
		final String MY_NAME = "why not?";
		
		System.out.println(MY_ID);
		System.out.println(MY_NAME);
		
//		MY_ID = 100;
		// 상수이기 때문에 type 이 일치해도 변경되지 않는다. - Read Only
		
		/*
		 * javaScript 였다면
		 * const MY_ID = 999;
		 * const MY_NAME = "why not?";
		 */
		
	}
}
