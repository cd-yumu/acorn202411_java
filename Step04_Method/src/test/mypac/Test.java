package test.mypac;

/*
 * 	[ 메소드를 만들 때 고려 해야 하는 것 ]
 * 
 * 	1. 접근 지정자 (모르면 public)
 * 	2. static or non static (모르면 non static)
 * 	3. 리턴 type (모르면 void)
 * 	4. 메소드명
 * 	5. 메소드에 전달하는 인자의 갯수와 데이터 type
 * 
 */

public class Test {
	/*
	 *	public => 패키지가 달라도 호출 가능
	 *	void => 이 메소드는 어떤 값도 리턴하지 않는다.
	 *	walk => 메소드 명은 walk
	 *	() => 이 메소드는 어떤 값도 인자로 전달 받지 않는 메소드 이다. (매개변수가 선언되지 않고 비어있음)
	 *
	 */
	
	public void walk() {
		System.out.println("걸어요!");
	}
	
	public int getNumber() {
		int num = 10;
		return num;
	}
	
	public String getGreeting() {
		String greet ="안녕하세요!";
		return greet;
	}
	
	// AirPlane type 을 리턴해 주는 메소드
	public AirPlane getPlane() {
		//AirPlain 객체를 생성해서 참조값을 p1 에 담고
		AirPlane p1 = new AirPlane();
		return p1;
	}
	
	// AirPlain type 을 메소드의 인자로 전달 받는 메소드
	public void setPlane(AirPlane plane) {
		
	}
	
	// int type, String type, Airplane type 세 개를 전달 받는 메소드
	public void doSomething(int num, String name, AirPlane plane) {
		
	}
	
	
}
