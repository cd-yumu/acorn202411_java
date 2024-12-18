package test.mypac;

/*
 * 이미 존재하는 Phone 클래스를 extends(상속) 받아서 HandPhone 클래스 정의하기
 */

public class HandPhone extends Phone{
//	확장의 개념 - extends => 상속한다.
	
	// 생성자
	public HandPhone() {
		System.out.println("Called HandPhone Constructor");
	}
	
	// 이동중에 전화를 걸어요
	public void mobileCall() {
		System.out.println("Calling while moving");
	}
	
	// 사진 찍는 메소드
	public void takePicture() {
		System.out.println("taking a picture of 30mil px");
	}
	
	
}
//부모가 갖는 메서드를 내 입맛에 맞게 바꿔서 사용할 수 있다.(재정의 가능)
//마치 직접 정의한 것 처럼 부모가 갖고있는 메소드를 내것처럼 사용 가능

