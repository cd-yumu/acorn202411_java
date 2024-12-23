package test.mypac;

public class Car {
	// field
	private String name;
	
	// constructor
	public Car(String name) {
		// 생성자의 매개 변수에 전달된 차의 이름을 필드에 저장
		this.name = name;
	}
	
	// method
	public void drive()	{
		System.out.println(name + "이(가) 달려요!");
	}
}
