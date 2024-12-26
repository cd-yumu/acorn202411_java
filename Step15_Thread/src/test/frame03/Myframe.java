package test.frame03;

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
				 Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("the work is ended");
		});	
		
		
//		startBtn2.addActionListener((e)->{
//			new Thread(()->{
//					System.out.println("10 초 걸리는 작업을 시작합니다.");
//					try {
//						Thread.sleep(1000*10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("작업이 종료 되었습니다.");
//			}).start();
//		});
		
	}
	
	// Main Thread
	public static void main(String[] args) {
		var frame = new Myframe("My Fram");
		// MyFrame 객체 안에서 this. 으로 호출했던 메소드를
		// 객체 외부에서는 참조값에 . 찍어서 호출할 수 있다.
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
