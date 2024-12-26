package test.frame01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame{
	// Constructor
	public Myframe(String title) {
		super(title);
		
		// 부보 객체(JFrame)의 메소드를 자식이 본인것처럼 쓸 수 있다
		//this.setBounds(100, 100, 300, 300);  
		//setBounds(100, 100, 300, 300);
		
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);	// X 버튼을 누르면 종료 동작
		
		
		setLayout(new FlowLayout());
		
		/*
		 *  - type 추론이 가능하다면 지역변수의 type 선언 대신에 var 로 선언 할수 있다.
		 *  - java 10  에서 추가된 문법,  아직도 실무에서는 1.8 버전을 쓰는 곳이 많기 때문에 주의!
		 *  - 지역변수에만 사용가능, 필드는 안됨
		 *  - 인터페이스 type 추론 불가 
		 *  - null 로 초기화 불가 
		 */
		var num = 10;
		var name = "kim";
		var isRun = true;
		
		var startBtn = new JButton("Start Work");
		add(startBtn);
		
		var startBtn2 = new JButton("Start Work2");
		add(startBtn2);
		
		startBtn.addActionListener((e)->{
			System.out.println("the work takes 10 seconds");
			
			try {
				// Thread.sleep(1000*10);
				for(int i = 0 ; i<10 ; i++) {
					Thread.sleep(1000);
					System.out.println((i+1)+"sec");
				}	
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("the work is ended");
		});	
		
		startBtn2.addActionListener((e)->{
			// WorkThread 클래스로 객체를 생성해서 참조값을 얻어낸 다음
			WorkThread t = new WorkThread();
			// start() 메소드를 호출해서 새로운 스레드가 시작되도록 한다.
			t.start();
		});
	}
	
	// Main Thread
	public static void main(String[] args) {
		var frame = new Myframe("My Fram");
		// MyFrame 객체 안에서 this. 으로 호출했던 메소드를
		// 객체 외부에서는 참조값에 . 찍어서 호출할 수 있다.
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		// 여기까지 흐름이 진행 된 후 대기중.. => 버튼을 누르면 해당 메소드에서 흐름 진행
		// 대기중이던 흐름이 필요한 곳으로 가서 진행된다.
		// 원래는 흐름이 메인을 다 돌고 끝나지만 gui 는 화면 처리를 해야하기 때문에 대기를 한다.
		// 언제 끝날지 모르는 불확실한 작업을 할 경우 어떻게 해야 하는가?
		// 메소드로 들어간 스레드를 새로운 작업 단위에서 작업시키고 기존 스레드를 바로 리턴하기
	}
	
}
