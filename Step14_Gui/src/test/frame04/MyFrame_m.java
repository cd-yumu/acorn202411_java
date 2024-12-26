package test.frame04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame_m extends JFrame{

	// 생성자
	public MyFrame_m() {
		// 프레임의 제목
		this.setTitle("My Fram");
		// 프레임의 위치와 크기 setBounds(x,y,width,height)
		setBounds(100,100,500,500);
		// 종료 버튼을 눌렀을 때 프로세스 전체가 종료되도록 한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//레이아웃 메니져 객체 생성
		BorderLayout layout = new BorderLayout();
		// 프레임의 레이아웃 메니져 설정
		setLayout(layout);
		
		// TextField 와 Button 을 배치할 Panel 객체
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.ORANGE);
		// TextField 와 Button 을 생성해서
		JTextField inputMsg = new JTextField(10);
		JButton sendBtn = new JButton("전송");
		// Panel 에 추가
		topPanel.add(inputMsg);
		topPanel.add(sendBtn);
		// 프레임의 위쪽에 Panel 추가
		add(topPanel, BorderLayout.NORTH);

		JTextArea ta = new JTextArea();
		//프레임 가운데 TextArea 추가
		add(ta, BorderLayout.CENTER);
		Font font = new Font("Serif", Font.BOLD, 20);
		ta.setFont(font);
		
		sendBtn.addActionListener((event)->{
			//TextField 에 입력한 문자열을 읽어온다.
			String msg = inputMsg.getText();
			//TextArea 에 출력한다.
			ta.append(msg+"\n");
		});
		
		// 화면상에 실제 보이도록 한다.
		setVisible(true);
	}
	
	// main method
	public static void main(String[] args) {
		new MyFrame_m();
	}
	
}
