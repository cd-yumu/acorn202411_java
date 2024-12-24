package test.main;

import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나눌 수 입력: ");
		String inputNum1 = scan.nextLine()	;
		
		System.out.println("나누어 지는 수 입력: ");
		String inputNum2 = scan.nextLine()	;
		

		
		try {
			// 문자열 형태의 숫자를 실제 정수로 변경하기
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
			
			// 계산하기
			int result = num2/num1;	// 몫
			int result2 = num2%num1;// 나머지
			System.out.println(num2+" 를 "+num1+" 으로 나눈 몫: "+result);
			System.out.println(num2+" 를 "+num2+" 으로 나눈 나머지: "+result2);
				
		}catch(NumberFormatException nfe){
			System.out.println(nfe.getMessage());
			System.out.println("숫자 형식으로 입력하세요");
			nfe.printStackTrace();
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("어떤 수를 0으로 나눌 수 없습니다.");
			ae.printStackTrace();
		}
		System.out.println("main 메소드가 정상 종료 됩니다.");
	}

}
