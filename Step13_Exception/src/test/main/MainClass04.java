package test.main;

public class MainClass04 {

	public static void main(String[] args) {
		System.out.println("***\nmain 메소드가 시작되었습니다.");
		
		// 스레드를 일정기간 지연 시키기
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//(mill second 단위로 숫자를 전달하면된다)
		
		System.out.println("main 메소드가 종료 됩니다.\n***");
		
	}

}
