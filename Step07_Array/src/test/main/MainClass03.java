package test.main;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		// 1. String type 을 담을 수 있는 방 3개짜리 빈 배열 객체를 만들어서 참조값을 names 라는 지역변수에 담아보세요.
		String[] names = new String[3];
//		String[] names2 = {null,null,null};
		
		// 2. 콘솔창으로 부터 문자열을 입력받을 수 있는 Scanner 객체를 생성해서 참조값을 scan 이라는 지역변수에 담아보세요
		Scanner scan = new Scanner(System.in);
		
		// 3. 반복문을 돌면서 Scanner 객체를 이용해서 이름을 입력 받고 입력받은 이름을 배열에 순서대로 저장
		for(int i = 0 ; i < names.length ; i++) {
			System.out.print(i+1 + "번째 이름을 입력하세요: ");
			String name = scan.nextLine();
			names[i] = name;
		}
		
		// 4. 반복문을 돌면서 배열에 저장된 이름을 순서대로 콘솔창에 출력해보세요
		for(int i = 0 ; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println(String.format("입력된 이름은 %s , %s , %s", names[0],names[1],names[2]));
		
		
	}

}
