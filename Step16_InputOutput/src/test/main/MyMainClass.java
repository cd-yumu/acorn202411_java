package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMainClass extends JFrame{

	public MyMainClass() {
		setTitle("My Memo");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		JTextField inputMsg = new JTextField(30);
		
		JButton btn = new JButton("입력");
		
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.YELLOW);
		add(topPanel, BorderLayout.NORTH);
		topPanel.add(inputMsg);
		topPanel.add(btn);
		
		JTextArea ta =new JTextArea();
		JScrollPane scroll = new JScrollPane(ta);
		add(scroll, BorderLayout.CENTER);
		
		
		// 버튼 누르면 수행하는 동작
		btn.addActionListener((e)->{
			
			// 입력박스에 있는 내용을 text 파일로 저장하기
			String msg = inputMsg.getText();
			File f = new File("C:/Users/acorn/Desktop/playground/myFolder/myMemo.txt");
			
			try {
				// 만약 파일이 없으면
				if(!f.exists()) {
					ta.setText(ta.getText() + "\n새 파일을 생성합니다.");
					//파일 생성
					f.createNewFile();
				}
				else {
					ta.setText(ta.getText() + "\n이미 파일이 존재함으로 기존 파일에 이어 작성합니다.");
				}
				var fw = new FileWriter(f,true);
				fw.append(msg);
				fw.append("\r\n");
				fw.flush();
				fw.close();
				ta.setText(ta.getText() + "\n새 문장을 저장 완료하였습니다.");
				
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}	
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyMainClass();
	}
	
	
}
