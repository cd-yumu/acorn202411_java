package test.main;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = scan.nextLine();
		if(name.equals("최유진")) {
			System.out.println(name + "이 맞으시군요!");
		}else {
			System.out.println(name + "은 못생겼습니다.");
		}
	}

}
