package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("src/test/mypac/memo.txt");
		
		Scanner scan = new Scanner(f);
		
		String line = scan.nextLine(); // 줄 단위로 읽어들이는 함수
		System.out.println("memo.txt 파일의 첫번째 줄: "+line);
		
	}
}
