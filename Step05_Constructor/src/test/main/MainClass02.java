package test.main;

import java.util.Random;

public class MainClass02 {
	public static void main(String[] args) {
		// Random 객체를 생성해서 Random type 지역 변수에 담기
		Random ran = new Random();
		
		
		int num = ran.nextInt(5);
		System.out.println(num);

		// 1~45 사이의 정수값 얻기
		int lottoNum = ran.nextInt(45) + 1;
	}
}
