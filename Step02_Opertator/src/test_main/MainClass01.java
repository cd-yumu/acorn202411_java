package test_main;

/*
 *  1. 산술 연산자 테스트
 *  
 *  + , - , * , / , %
 */

public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		
		// + 연산 하기
		int sum = 10 + 1;
		int sum2 = num1 + num2;
		int sum3 = 10 + num2;
		
		// 정수끼리 연산하면 결과는 정수만 나온다.
		int result1 = 5/3;
		int result2 = num1 / num2 ;
		
		// 연산의 결과로 실수 값을 얻어내고 싶으면 적어도 하나는 실수여야 한다.
		double result3 = 5 / 3.0;
		
		// type casting (형 변환)
		byte a = 10;
		int b = a;
		
//		int c = 10;
//		byte d = c; // 오류!
		
		int e = 10;
		byte f = (byte)e; // type casting
		
		
	}
}
