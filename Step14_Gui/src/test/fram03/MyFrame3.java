package test.fram03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame implements ActionListener{
	// 필드 - 객체 안에서 사용할 공유되어야 할 값들을 필드로 사용한다.
	int count;
	JButton countBtn;
	
	
	// Constructor
	public MyFrame3() {
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
		countBtn = new JButton("0");
		// 프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		add(countBtn);
		
		// 버튼에 전달할 ActionListener 인터페이스 type
		// MyFrame3 클래스는 implements ActionListener 인터페이스를 구현했기 때문에 this 전달 가능
		countBtn.addActionListener(this);
		
		// 화면상에 실제 보이도록 한다.
		setVisible(true);
	}
	
	// main method
	public static void main(String[] args) {
		new MyFrame3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// count 는 필드라서 가져올 수 있음
		count++;
		// 버튼은 지역변수여서 가져올 수 없음 그래서 필드로 만들어버림
		countBtn.setText(Integer.toString(count));
		
	}
	
}
