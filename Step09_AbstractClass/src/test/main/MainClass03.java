package test.main;

public class MainClass03 {
	public class Gura{
		public void say() {
			System.out.println("안녕! 나는 구라야~");
		}
	}
	int num = 10;
	public void test() {}
	
	public static void main(String[] args) {
		// static 범위 안에서는 static 자원만 사용가능하다
//		Gura g = new Gura();		// 오류
//		System.out.println(num);	// 오류
//		test();						// 오류
		
		
		
		
		// 메소드 안에서도 클래스를 정의할 수 있다.
		// 여기 정의한 클래스는 메소드 안쪽 영역에서만 사용할 수 있다.
		// 메소드 안에 정의한 클래스는 Local Inner Class 라고 한다.
		class Cat{
			public void say() {
				System.out.println("야옹!");
			}
		}
		
		// Local Inner Class 를 이용해서 객체 생성하고 사용해 보기
		Cat c = new Cat();
		c.say();
	}
}
