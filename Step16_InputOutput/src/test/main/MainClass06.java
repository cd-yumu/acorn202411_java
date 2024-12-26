package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		// 콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		
		
		// OutputStreamWriter 를 BufferedWriter 의 생성자에 전달하여 객체 생성
		OutputStream os = ps;
		var osw = new OutputStreamWriter(os);
		
		var bw = new BufferedWriter(osw);
		/*
		 * window 의 개행 기호: \r\n
		 * linux, mac os 의 개행 기호 : \n
		 */
		
		try {
			bw.write("하나");
			bw.newLine();// 운영 체제에 맞는 개행 기호를 자동으로 출력하는 메소드
			bw.write("두울");
			bw.newLine();
			bw.write("세엣");
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
