package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class MainClass01 extends JFrame{
	
	String addr;
	String contents;
	
	public MainClass01() {
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
		JScrollPane sp = new JScrollPane(ta); 
		
		// 스크롤 추가

		
		//프레임 가운데 TextArea 추가
		add(ta, BorderLayout.CENTER);
		

		
		Font font = new Font("Serif", Font.BOLD, 20);
		ta.setFont(font);

		
		sendBtn.addActionListener((event)->{
			//TextField 에 입력한 문자열을 읽어온다.
			addr = inputMsg.getText();
			
			try {
				URL url = new URL(addr);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // HTTP 요청 메서드 설정
	            connection.setRequestMethod("GET");

	            // 헤더 설정 (필요에 따라 추가)
	            connection.setRequestProperty("Accept", "application/json");

	            // 응답 코드 확인
	            int responseCode = connection.getResponseCode();
	            System.out.println("Response Code: " + responseCode);
	            ta.append(Integer.toString(responseCode));
	            
	            
	            //응답한 문자열을 누적시킬 객체 
	            StringBuilder response = new StringBuilder();
	            //만일 정상적인 응답이라면 
	            if (responseCode == HttpURLConnection.HTTP_OK) {
	            	//응답하는 내용을 읽어들일 객체 
	            	BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));           
	                //반복문 돌면서
	            	while (true) {
	                	//한줄씩 읽어들이고 
	                	String line=br.readLine();
	                	//만일 다 읽었다면 
	                	if(line==null) {
	                		break; //반복문 탈출
	                	}
	                	//읽은 문자열 한줄을 누적시킨다.
	                    response.append(line+"\r\n");
	                    contents = contents + line +"\r\n";
	                }
	               
	            } else {
	                System.out.println("Request failed. Response Code: " + responseCode);
	            }
	            //누적된 문자열을 출력하기 
	            String msg = response.toString();
	            ta.append(msg+"\n");
	            
	            // 연결 해제
	            connection.disconnect();
				
			} catch (Exception e) {
	            e.printStackTrace();
	        }
		});
		
		// 화면상에 실제 보이도록 한다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MainClass01();
	}		

}