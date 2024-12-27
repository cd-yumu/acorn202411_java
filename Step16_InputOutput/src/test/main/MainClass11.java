package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass11 {

	public static void main(String[] args) {
		
		try {
			// 파일로 부터 byte 알갱이를 읽어들일 객체 생성
			var fis = new FileInputStream("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\1.jpg");
			
			// byte 알갱이를 파일에 출력할 객체 생성
			var fos = new FileOutputStream("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\copied.jpg");
	
			// 반복문 돌면서
			while(true) {
				
				// 1 byte 읽어들여서
				int readedByted = fis.read();
//				byte readedByted = (byte)fis.read();
				System.out.println(readedByted);

				
//				fis.read() 는 int 형을 반환하는데 byte가 숫자인가?
//				byte 알갱이를 보고 그걸 10 진수로 대응되는 값을 반환한다
//				ex) 0000 0000 => 0 , 1111 1111 => 255
//				뭐 결국 숫자다
				
				if(readedByted == -1) break;
				//읽어들인 1byte 출력
				fos.write(readedByted);
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다.");
			// 마무리 작업
			fos.close();
			fis.close();
			
		} catch(Exception e) {
			
		}

	}

}
