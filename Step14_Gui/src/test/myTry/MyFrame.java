package test.myTry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

public class MyFrame extends JFrame{
	// 생성자에 gui 생성
	public MyFrame() {
		// 생성될 gui 프레임 기본 셋팅
		this.setTitle("Try My Frame");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 레이아웃 객체 생성 (Flow 또는 Border) - 어떤 방식으로 배치할 것인가
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		// TextBox 생성
		JTextField inputMsg = new JTextField(25); 
		add(inputMsg);
		// 버튼 생성
		JButton btn = new JButton("전송");
		add(btn);
		
		// 프레임 위쪽에 Panel 추가
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.ORANGE);
		add(topPanel,BorderLayout.NORTH);
		
		setVisible(true);
	}
}
