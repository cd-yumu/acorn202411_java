package test.main;

import test.mypac.Drill;

public class MainClass04 {

	public static void main(String[] args) {
		
		Drill d1 = new Drill() {
			
			@Override
			public void hole() {
				System.out.println("책상에 구멍을 뚫어요!");
			}
			
		};
//		객체에 동작이 하나 포함되어 있다.
//			해당 객체를 메소드 호출하면서 전달한다.
		useDrill(d1);
		
		
		
		Drill d2 = ()->{
			System.out.println("의자에 구멍을 뚫어요!");
		};
//		Drill d2 = ()=>{};	javaScript의 화살표 함수와 닮았다.
//		Drill d2 = function(){};
		useDrill(d2);
	
		
		
		useDrill(()->{
			System.out.println("몰라 아무데나 구멍을 뚫어요!");
		});
//		javascipt 에서 useDrill(function(){}); 와 같은 생각을 할 수도 있다.
		
	}
						
	public static void useDrill(Drill d) {
//		메소드 안에서는 객체에 포장된 1개의 동작을 사용한다.
		d.hole();
		d.hole();
	}
}
