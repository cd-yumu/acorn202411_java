package test.main;

import java.util.Scanner;

public class MainClass03 {

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
				
		}catch(Exception e) {
			// Exception 은 모든 예외의 부모 type 이기 때문에 어떤 예외가 발생해도 여기가 실행된다.
			System.out.println("***\n예외가 발생했습니다.");
			System.out.println("예외 메시지: " + e.getMessage()+"\n***");
		}finally {
			// 예외가 발생하건 안 하건 반드시 실행이 보장되는 블럭이다.
			// 중요한 마무리 작업을 여기서 주로 수행한다.
		}
		System.out.println("main 메소드가 정상 종료 됩니다.");
	}

}
