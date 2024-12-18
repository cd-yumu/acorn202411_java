package test.auto;

public class SportsCar extends Car{

	// Engine type 을 매개변수에 전달받는 생성자
	public SportsCar(Engine engine) {
		/*
		 * super() 는 부모 생성자 (Car 클래스의 생성자)를 의미한다.
		 * 부모 생성자에 필요한 값을 자식 생성자에서 받아서 전달해야 한다.
		 * super() 코드 실행전에 다른 코드가 있으면 안된다.
		 */
		super(engine);
	}
	
	public void openDrive() {
		if(this.engine == null) {
			System.out.println("Can't run without Engine");
			return; // method return here 
		}
		System.out.println("Run~");
	}
}
