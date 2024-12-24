package test.main;

/*
 * run 했을 때 콘솔창에
 * 1초, 2초, 3초, ...
 * 경과 시간이 출력되다가 
 * 10초 까지만 출력되고 종료되는 프로그래밍을 해보세요
 * *hint: Thread.sleep(1000);
 */

public class QuizMain {
	public static void main(String[] args) {
		
		System.out.println("START");
		
		try {
			for(int i = 1 ; i < 11 ; i++) {
				System.out.println(i + "sec");
				Thread.sleep(1000);
			}	
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("END");
	}
}
