package test.mypac;

public class Zoo {
	
	// 내부 클래스 (Inner Class)
	public class Monkey{
		public void say() {
			System.out.println("안녕! 나는 원숭이야");
		}
	}
	
	public class Tiger{
		public void say() {
			System.out.println("어흥!");
		}
	}
	
	// zoo 클래스의 멤버 메소드
	public Monkey getMonkey() {
		// 내부 클래스로 객체를 생성해서 리턴해 줄수도 있다.
		return new Monkey();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
}
