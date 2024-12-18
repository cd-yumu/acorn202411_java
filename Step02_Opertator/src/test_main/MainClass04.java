package test_main;

/*
 *  4. 논리 연산자 테스트
 *  
 *  && , || , !
 */

public class MainClass04 {
	// 클래스명은 .java 파일명과 같아야 한다.
	// 중괄호는 클래스의 범위를 나타낸다.
	// 클래스 안에는 field, method 를 만는다.
	/*
	 * class 명은 MainClass 04
	 * MainClass04 는 main 이라는 이름의 메소드를 하나 가지고 있다.
	 */

	public static void main(String[] args) {
		// 어플리케이션 가동(run)시 도입부가 되는 매우 특별한 main() 메소드다.
		
		
		/*
		 * 	or 연산
		 * 	또는 이라고 읽으면 된다.
		 * 
		 *  어느 하나만 true 면 결과는 true
		 *  모두다 false 일때만 결과는 false
		 *  
		 */
		boolean result1 = false || false;	// false
		boolean result2 = false || true;	// true
		boolean result3 = true || false;	// true
		boolean result4 = true || true;		// true
		
		/*
		 * 	and 연산
		 * 	그리고 라고 읽으면 된다.
		 * 
		 *  모두다 true 일때만 결과는 true
		 *  어느 하나만 false 면 결과는 false
		 */
		boolean result5 = false && false;	// false
		boolean result6 = false && true;	// false
		boolean result7 = true && false;	// false
		boolean result8 = true && true;		// true
		
		/*
		 *  not 연산
		 *  ~가 아니면 이라고 읽으면 된다.
		 *  
		 *  boolean 값을 반전 시킨다.
		 */
		boolean result9 = !true;			// false
		boolean result10 = !false;			// true
		
		

	}

}
