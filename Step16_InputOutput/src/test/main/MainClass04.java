package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		// 콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		
		// PrintStream 객체의 참조값을 부모 type 변수에 담기
		// OutputStream 도 1 byte 처리 스트림이다. (한글 처리 불가)
		OutputStream os = ps;
		
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			
			os.write(47000);
			os.write(55148);
			// os.write(44032); // 한글 처리 불가
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}