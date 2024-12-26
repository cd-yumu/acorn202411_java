package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		// 1 byte 처리 스트림
		InputStream kbd = System.in;
		// 2 byte 처리 스트림 (65,536 가지를 표현할 수 있다.) 한글 처리 가능한 객체
		var isr = new InputStreamReader(kbd);
		System.out.println("입력: ");
		
		try {
			int code = isr.read();
			System.out.println("code: " + code);
			char ch = (char)code;
			System.out.println("ch: "+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
