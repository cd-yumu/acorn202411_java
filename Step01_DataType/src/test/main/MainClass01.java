package test.main;

/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;	// -128 ~ 127
 *  - short 변수명;	// -32768 ~ 32767
 *  - int  변수명;	// -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명;	// -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명;		// 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명;	// 4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */

public class MainClass01 {
	// run 했을 때 실행의 흐름 시작되는 특별한 main 메소드 
	// (javascript 의 function 과 약간 비슷한 느낌 function main(args) )
	// 문자열 타입의 배열 args 를 받을 준비도 되어 있다.
	public static void main(String[] args) {
	
		/*
		 * 여러 줄 주석..
		 * 하나
		 * 두울
		 */
			
		// 정수형 변수 선언하고 값 대입하기
		byte iByte = 10;
		short iShort = 500;
		int iInt = 1000; 		// 주로 사용
		long iLong = 10000;
		
		// 실수형 변수 선언하고 값 대입하기
		float num1 = 10.1f;
		double num2 = 10.2d;	// 주로 사용
		double num3 = 10.3;		// d, f 를 붙이지 않으면 double type 으로 간주 된다.
		
		
		// 원래는 프로젝트 하나당 메인메소드는 하나인데 우리는 학습해야 하니까 어쩔 수 없이 여러개
	
	}
}
