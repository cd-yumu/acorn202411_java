package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMainClass2 extends JFrame{
	File f = new File("C:/Users/acorn/Desktop/playground/myFolder/myMemo.txt");
	public MyMainClass2() {
		
		setTitle("My Memo");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		JTextField inputMsg = new JTextField(30);
		
		JButton btnSave = new JButton("SAVE");
		JButton btnLoad = new JButton("LOAD");
		
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.ORANGE);
		add(topPanel, BorderLayout.NORTH);
		topPanel.add(inputMsg);
		topPanel.add(btnSave);
		topPanel.add(btnLoad);
		
		JTextArea ta =new JTextArea();
		JScrollPane scroll = new JScrollPane(ta);
		add(scroll, BorderLayout.CENTER);
					
		
		
		// 저장 버튼 누르면 파일에 입력 및 저장
		btnSave.addActionListener((e)->{
			try {
				// 입력박스에 있는 내용을 text 파일로 저장하기
				String msg = inputMsg.getText();
				// 만약 파일이 없으면 파일 생성
				if(!f.exists()) f.createNewFile();
				// 입력 및 저장
				var fw = new FileWriter(f,true);
				fw.append(msg);
				fw.append("\r\n");
				fw.flush();
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		});
		
		// 로드 버튼을 누르면 파일에 있는 내용 읽기
		btnLoad.addActionListener((e)->{
			try {
			var sb = new StringBuilder();
			// 파일로 부터 문자열을 읽어들일 수 있는 객체 생성
			FileReader fr = new FileReader(f);

			// 문자열을 줄 단위로 읽어들일 수 있는 객체 생성
			var br = new BufferedReader(fr);
			// 무한 루프 돌면서
			while(true) {
				String line = br.readLine();

				// 더 이상 읽어올 문자열이 없으면 반복문 탈출
				if(line == null) break;

				// 읽어낸 문자열을 StringBuilder 객체에 누적시키기
				sb.append(line);
				sb.append("\r\n");
			}
			//StringBuilder 객체에 누적된 문자열을 한번에 출력하기
			String result = sb.toString();
			ta.setText(result);
			
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyMainClass2();
	}
	
	
}
