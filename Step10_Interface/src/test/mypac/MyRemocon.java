package test.mypac;
	
public class MyRemocon implements Remocon {// 인터페이스는 implements 해야 한다

//	미완성인 메소드를 제정의override 강제
	public void up() {
		System.out.println("볼륨을 올려요!");
	}

	public void down() {
		System.out.println("볼륨을 내려요!");
	}	
}
