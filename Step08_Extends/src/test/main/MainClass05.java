package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;
import test.mypac.IosPhone;

public class MainClass05 {

	public static void main(String[] args) {
		// AndroidPhone 객체를 생성해서 참조값을 AndroidPhone type p1 이라는 지역변수에 담기
		AndroidPhone p1 = new AndroidPhone();
		p1.call();
		p1.mobileCall();
		p1.takePicture();
		p1.doInternet();
		
		System.out.println("------------------------");
		
		// AndroidPhone 객체를 생성해서 참조값을 HandPhone type p2 이라는 지역변수에 담기
		HandPhone p2 = new AndroidPhone();
		p2.takePicture(); //1000mil px
		// override 된 메소드가 호출
		
		System.out.println("------------------------");
		HandPhone p3 = new HandPhone();
		p3.takePicture(); //30mil px
		// 원래 HandPhone 객체의 메소드가 호출
		
		
		/*
		HandPhone 클래스를 상속 받아서 
		IosPhone 클래스를 정의하고
		메소드도 마음대로 추가해서 
		사용하는 테스트 해보세요
		*/
		System.out.println("------------------------");
		IosPhone my_p =new IosPhone();
		my_p.faceRecognize();
		my_p.call();
		my_p.kakakoTalk();
		my_p.takePicture();
		
		
		
	}

}
