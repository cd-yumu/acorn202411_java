package test.main;

public class MainClass05 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("***\nmain 메소드가 시작되었습니다.");
		
		// 스레드를 일정기간 지연 시키기
		Thread.sleep(1000*5);

		
		System.out.println("main 메소드가 종료 됩니다.\n***");
		
	}

}
