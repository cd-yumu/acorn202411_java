package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass12 {

	public static void main(String[] args) {
	
		// 파일로 부터 byte 알갱이를 읽어들일 객체 생성
		FileInputStream fis = null;
		// byte 알갱이를 파일에 출력할 객체 생성
		FileOutputStream fos = null;		

		try {
			// 선언과 대입을 분리할 필요가 있다. : try -catch 문 안에서 선언한 변수는 그 블럭 안에서만 사용할 수 있기 때문에 finally 외 다른 곳에서 사용할 수가 없다.
			fis = new FileInputStream("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\1.jpg");
			fos = new FileOutputStream("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\copied.jpg");
			// byte 알갱이 여러개를 한 번에 담을 배열 미리 준비하기
			byte[] buffer = new byte[1024]; // 한번에 1 KB 개씩 읽을 수 있다.
			
			// 반복문 돌면서
			while(true) {
				// byte[] 배열을 전달해서 byte 알갱이를 한번에 1024 개씩 읽어들인다.
				int readedCount = fis.read(buffer);
				System.out.println(readedCount); // 1024 ... , 52 , -1
				if(readedCount == -1)break;
				// byte[] 배열에 저장된 byte 알갱이를 0 번 인덱스로 부터 읽은 갯수만큼만 출력
				fos.write(buffer,0,readedCount);
				// 인자가 3개 짜리를 사용하는 이유 - 마지막 데이터의 값에서 쓰레기 값을 제외하기 위해서
			}
			System.out.println("파일을 copy 했습니다.");
			
			
		} catch(Exception e) {
			
		} finally {
			// 마무리 작업
			try {
				if(fos!=null) fos.close(); // null 이 아닐때만 닫기 작업 해 
				if(fos!=null) fis.close(); // null 이면 하지마 - 다음 작업 진행 가능
			} catch (IOException e) {}
			
		}


	}

}
