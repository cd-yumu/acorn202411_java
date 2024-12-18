package test_main;

/*
 *  6. 3항 연산자
 */

public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait = true;
		// isWait 이 true 면 "기다려요" 가 대입되고 false 면 "기다리지 않아요"가 대입된다.
		String result = isWait ? "im waiting" : "im not waiting" ; 
		System.out.println(result);
		
		// 위 3항 연산자는 아래와 같이 if ~ else 문과 같은 로직이다.
		String result2 = null;
		if(isWait) {
			result2 = "im waiting";
		}else {
			result2 = "im not waiting";
		}
		System.out.println(result2);
	}
}
