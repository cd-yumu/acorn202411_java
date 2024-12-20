package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass03 {
	
	public static void main(String[] args) {

		// 인사말을 담을 ArrayList 객체를 생성해서 참조값을 greets 라는 지역변수에 대입하기
		ArrayList<String> greets = new ArrayList<>();
		
		// greets 에 들어있는 참조값을 이용해서 인사말 3개를 임의로 담아보세요
		greets.add("Hello");
		greets.add("안녕하세요");
		greets.add("nihao");
		
		// 확장 for 문을 이용해서 모든 인사말을 콘솔창에 순서대로 출력해보세요.
		for(String tmp : greets) {
			System.out.println(tmp);
		}
		
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		greets.forEach(con);
		
		
		greets.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
	}
	
}
