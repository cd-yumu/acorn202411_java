package test.mypac;

public class WowException extends RuntimeException{
	// 생성자의 매개 변수로 예외 메시지를 전달 받아서
	public WowException(String msg) {
		// 부모 생성자에 전달해준다.
		super(msg);
	}
}
