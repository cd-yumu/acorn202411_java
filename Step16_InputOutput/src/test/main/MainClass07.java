package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main() 메소드가 \"시작\" 되었습니다.");
		System.out.println("main() 메소드가 \\시작\\ 되었습니다.");
		
		// 파일에 저장할 문자열
		String msg = "나는 JAVA의 신이다!";
		
		// /myFolder/memo.txt 파일에 msg 변수 안에 들어있는 문자열을 출력하기
		
		// memo.txt 파일을 만들기 위한 file 객체 생성
		//File f = new File("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\memo.txt");
		// 슬래시 하나만 써도 인식한다.
		File f = new File("C:/Users/acorn/Desktop/playground/myFolder/memo.txt");
		
		try {
			// 만일 해당 파일이 존재하지 않으면 
			if(!f.exists()) {
				// 새로 만들기
				f.createNewFile();
				System.out.println("memo.txt 파일을 만들었습니다.");
			}
			// new FileWriter(File 객체, append mode 여부)
			var fw = new FileWriter(f, true);
			// append 는 추가 / write 는 덮어쓰기
			fw.append(msg);
			fw.append("\r\n");
			fw.flush();
			fw.close();
			System.out.println("memo.txt 파일에 문자열을 기록했습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
