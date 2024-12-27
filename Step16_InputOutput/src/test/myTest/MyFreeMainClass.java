package test.myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFreeMainClass {

	public static void main(String[] args) {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try {
			int i = b.read();
			String line = b.readLine();
			System.out.println("I: " +i);
			System.out.println("line"+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InputStreamReader is = new InputStreamReader(System.in);
	}

}
