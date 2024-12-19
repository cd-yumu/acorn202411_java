package main;

/*
 * Abstract				- 미완성 상태
 * Inner Class			- 클래스 안에 클래스 
 * Local Inner Class 	- 메소드 안에 클래스
 */

public class MyTest02 {

	public static abstract class InnerClass {
		// abstract method also abstract class
		public abstract void say();
		
	}

	public static class BabyInnerClass extends InnerClass{
		@Override
		public void say() {
			System.out.println("saying");
		}
		// override when extends abstract class 
	}
		
	public static void main(String[] args) {
	// static area
		
	
		// InnerClass ic1 = new InnerClass();
		// abstract class can't create new object
		
		InnerClass ic2 = null;
		// but can use data type
		
		InnerClass ic3 = new BabyInnerClass();
		ic3.say();
		
		
		class LocalInnerClass{
			
		}
	}
	
	
	
}
