package test.myTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class MyMainClass3 {
	
//	// copy file path
//	static String FPATHFROM = "C:\\Users\\acorn\\Desktop\\my_test\\testText.txt";
//	static String FPATHTO = "C:\\Users\\acorn\\Desktop\\my_test\\testText02.txt";
//			
	public static void main(String[] args) {
		
		// 콘솔을 읽어들이는 기능을 가진 객체 생성
		// 1 바이트 읽을 때
		InputStream is = System.in;
		// 2 바이트 읽을 때
		InputStreamReader isr = new InputStreamReader(is);
		// 2 바이트 + 문자열 읽을 때
		BufferedReader br = new BufferedReader(isr);
		// 2 바이트 + 문자열 읽을 때
		Scanner scan = new Scanner(System.in);
		
		// 콘솔에 출력하는 기능을 가진 객체 생성
		// 1바이트 출력
		OutputStream os = System.out;
		// 2바이트 출력
		OutputStreamWriter isw = new OutputStreamWriter(os);
		// 2바이트 + 문자열 출력
		BufferedWriter bw = new BufferedWriter(isw);
		
		
		
		
		try {
			
//			os.write(97);
//			os.flush();

			
//			isw.write(97);
//			isw.write("가나");
//			isw.flush();
			
			bw.write(97);
			bw.write("가나");
			bw.flush();
			
//			int code = is.read();
//			System.out.println("InputStream 사용:" + code);
//			System.out.println("InputStream 결과:" + (char)code);
			
//			int code2 = isr.read();
//			System.out.println("InputStreamReader 사용:" + code2);
//			System.out.println("InputStreamReader 결과:" + (char)code2);
			
//			int code3 = br.read();
//			System.out.println("BufferedReader 사용:" + code3);
//			System.out.println("BufferedReader 결과:" + (char)code3);
			
//			String code4 = br.readLine();
//			System.out.println("BufferedReader 사용결과:" + code4);

//			String code5 = scan.nextLine();
//			System.out.println("Scanner 사용결과: " + code5);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
