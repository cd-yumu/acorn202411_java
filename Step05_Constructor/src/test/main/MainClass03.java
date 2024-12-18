package test.main;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		/*
		 *  System 클래스의 in 이라는 필드에는 콘솔창으로 부터 입력 받을 수 있는
		 *  객체의 참조값이 들어있다.
		 *  in 의 type 은 InputStream 이다.
		 *  Scanner 클래스의 생성자는 아래와 같은 모양의 생성자가 있다.
		 *  Scanner(InputStream is)
		 * 	따라서 아래의 코드는 콘솔창으로 부터 입력받을 수 있는 Scanner 객체가 생성된 것이다.
		 */
		
		System.out.println("문자열 입력: ");
		
		Scanner scan = new Scanner(System.in);
		
		
		
		String line = scan.nextLine(); // 콘솔에서 입력한 String을 한 줄 읽어들이는 메소드
//		문자열을 줄 단위로 읽어들이는 메소드 . 리턴 타입 String
		System.err.println("입력한 문자열: " + line);
		

	}
	
	
//	class System{
//		public static InputStream in
//	}
//	
//	class Scanner{
//		public Scanner(InputStream is) {}  
//	}

}
