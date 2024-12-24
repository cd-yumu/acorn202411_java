package test.fram03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	// 필드
	int count;
	
	// Constructor
	public MyFrame() {
		// 프레임의 제목
		this.setTitle("My Fram");
		// 프레임의 위치와 크기 setBounds(x,y,width,height)
		setBounds(100,100,500,500);
		// 종료 버튼을 눌렀을 때 프로세스 전체가 종료되도록 한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//레이아웃 메니져 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		// 프레임의 레이아웃 메니져 설정
		setLayout(layout);
		// JButton 객체 생성
		JButton countBtn = new JButton("0");
		// 프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		add(countBtn);
		
		//final int count = 0;
		
		// 버튼에 전달할 ActionListener 인터페이스 type
		ActionListener listener = new ActionListener() {
			// 필드
//			int count = 0;
			
			@Override	// 이름없는클래스 implements ActionListener
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀네");
				// count 를 1증가
				count++;
				// 정수를 문자열로 변경한 다음 setText() 메소드에 전달
				countBtn.setText(Integer.toString(count));
				
// class 안 - 필드 / method 안 - 지역변수
//				int btnText = Integer.parseInt(countBtn.getText());
//				countBtn.setText(String.format("%s", ++btnText));
			}
		};
		countBtn.addActionListener(listener);
		
		// 화면상에 실제 보이도록 한다.
		setVisible(true);
	}
	
	// main method
	public static void main(String[] args) {
		new MyFrame();
	}
	
}
