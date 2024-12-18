package test.mypac;
/*
 *  class 의 역할
 *  
 *  1. 객체의 설계도 역할
 *  	- 객체는 heap 영역(사물함) 에 들어있는 물건이라고 생각하면 된다.
 *  	- class 를 이용해서 객체를 원하는 시점에 원하는 갯수 만큼 만들어 낼 수 있다.
 *  	- 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class 로 설계할 수 있다.
 *  
 *  2. data type 역할
 *  
 *  3. static 필드와 메소드를 포함하는 역할
 */
public class Car {
	// 데이터 저장소 field
	public String name;		// 선언만 하고 값을 넣지 않으면 null 로 초기화
	public int price;		// 선언만 하고 값을 넣지 않으면 0 으로 초기화
	
	// 기능 method
	public void drive() {
		System.out.println(this.name + "이(가) 달려요!");
		Car a = this; // 이 클래스로 생성된 객체의 참조값
	}
	// (js)function drive(){}
	
}
