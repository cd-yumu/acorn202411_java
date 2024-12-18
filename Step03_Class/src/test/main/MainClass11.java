package test.main;

import test.mypac.Product;

public class MainClass11 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("에어팟");
		p1.setPrice(20);
//		setter 메소드를 이용해서 필드에 값을 저장할 수 있다.
		
		Product p2 = new Product(2, "아이폰", 100);
		
		
		String info = "아이디: " + p1.getId() + ", 이름: " +p1.getName()+ ", 가격: "+ p1.getPrice();
		
		String info3 = String.format("아이디: %d, 이름: %s, 가격: %s 만원",p1.getId(), p1.getName(), p1.getPrice());
		/*
		 * String 클래스의 format() 메소드
		 * %d : 정수
		 * %s : 문자열
		 * %f : 실수
		 * %b : boolean
		 * %% : %문자 출력할 때
		 */
		
		System.out.println(info);
		System.out.println(info3);
		
	}

}
