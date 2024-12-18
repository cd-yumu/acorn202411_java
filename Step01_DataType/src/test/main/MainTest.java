package test.main;

public class MainTest {
	static final int IFINAL = 10;
	
	public static void main(String[] args) {
		int a = 10;
		
		final int b = 10;
		
		a = 20;
		
		System.out.println(IFINAL);
		System.out.println(b);
		
	}
}
