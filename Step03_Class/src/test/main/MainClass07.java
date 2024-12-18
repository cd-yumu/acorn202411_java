package test.main;

import test.mypac.MyUtil;
import test.mypac.YourUtil;

public class MainClass07 {

	public static void main(String[] args) {
		// MyUtill 클래스의 static 메소드 호출
		MyUtil.send();
		
		// MyUtill 클래스의 static 필드 참조
		String a = MyUtil.version;
//		static 필드일 경우 new 없이 바로 사용 할 수 있다.
		
		
//		YourUtil.remove();
//		String b = YourUtil.color;
//		
//		
//		일반 객체는 필드 영역에 만들어지지만
//		static으로 만들어진 객체는 다른 영역에 만들어진다.
//		
//					static	|	stack	|	heap
//	Class가 올라가는 영역	|	지역변수|	객체가 만들어지는 곳
//	MyUtil									idxx
//	YourUtil								idxx
//											idxx					
//static 영역에는 참조값이 없다. 클래스명으로 구분한다.
//동일한 클래스가 절대 여러개 올라가지 않고 하나씩만 올라간다.
//어떤 데이터를 모든 객체들이 어떤 값 하나만 가지고 공유 및 쓰고 싶을 때 사용ㅎ나다.
//하나만 있어도 될 때
//용도가 다르다.
//stack, heap 과 static의 차이
//필드에 다른 객체의 참조값도 들어갈 수 있다.
//필드 필드 필드!!
//System.out 이라는 필드에 있는 println() 이라는 메소드를 호출
//		
//		system.out
//		
//		
//		class System{
//			public static PrintStream out = ~~~
//		}
//						
	}

}
