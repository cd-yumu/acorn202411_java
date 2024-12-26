package test.main;

public class MainClass01 {

	public static void main(String[] args) {
		// Main Thread
		System.out.println("Start Main Method.");
		
		// 실행의 흐름이 5초로 잡혀있다.
		try {
//			Thread.sleep(5000);	// 5초 동안 스레드가 진행되지 않음
			for(int i = 0; i<5;i++) {
					Thread.sleep(1000);
					System.out.println((i+1)+"sec");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		test(); // test() 메소드 안 쪽으로 실행의 흐름이 넘어간다.
		
		System.out.println("End Main Method");
	}
	
	public static void test() {
		System.out.println("Start test() Method"); 
		// test() 메소드가 리턴(종료)된다.
	}

}
