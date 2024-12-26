package test.frame01;

/*
 * 새로운 스레드 만드는 방법
 * 1. Thread 클래스를 상속 받은 클래스를 정의한다.
 * 2. run() 메소드를 오버라이드 한다
 * 3. run() 메소드 안에서 새로운 스레드에서 해야 할 작업을 코딩한다.
 * 4. 만든 클래스로 객체를 생성하고 해당 객체의 Start() 메소드를 호출하면 새로운 스레드가 시작된다.
 */

public class WorkThread extends Thread{
	
	
	@Override
	public void run() {
		
	}
 	
//	@Override
//	public void run() {
//		// 새로운 스레드에서 해야 할 작업을 run() 메소드 안에서 한다.
//		System.out.println("10 초 걸리는 작업을 시작합니다.");
//		try {
//			Thread.sleep(1000*10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("작업이 종료 되었습니다.");
//	}
	
	// 질문
	// run 메소드는 오버라이드 해야만 사용할 수 있는 메소드라면 추상 메소드 라서?
	// 구현 되어 있고 추상 메소드가 아니다.
	
	// 이하 생각 할 필요 없음
	// 그래서 Thread 가 run 이라는 추상 메소드를 가지고 있는 클래스라면 
	// Thread 는 추상 클래스 이기 때문에
	// Thread 를 상속 받기 위해서는 
	// Thread 가 가지고 있는 모든 추상 클래스를 오버라이드 해야 하지 않나?

}
