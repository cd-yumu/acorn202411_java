package test.main;

import test.mypac.Bike;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 1. bike 객체에 담을 수 있는 방 3개 짜리 배열 객체를 생성해서 참조값을
		 * 	  bike 라는 지역 변수에 담아보세요
		 * 2. 배열의 각각의 방(0,1,2번) 에 Bike 객체를 생성해서 담아보세요
		 * 3. 반복문 for 를 이용해서 순서대로 배열의 각각의 방에 있는 Bike 객체의 
		 * 	  ride() 메소드를 호출해 보세요
		 */
		
		Bike[] bikes = new Bike[3];
		
		// 배열의 방의 사이즈 만큼 반복문 돌기
		for(int i = 0 ; i < bikes.length ; i++) {
			bikes[i] = new Bike(); 
		}
		
		for(int i = 0 ; i < bikes.length ; i++) {
			// i 번째 방에 있는 Bike 객체의 참조값 얻어오기
			Bike tmp = bikes[i];
			// tmp 에 있는 Bike 객체의 .ride() 메소드 호출
			tmp.ride();	
			
//			bikes[i].ride();
		}
		
		System.out.println();
		
		// for 문 줄임 버전 (확장for문)
		// (임시 배열 : 참조할 것)
		for(Bike tmp:bikes) {
			tmp.ride();
		}
		
	}
}
