package test.mypac;

public class Member {

//	필드를 static 으로 만들것인가 non-static으로 만들것인가 판단
	public int num;
	public String name;
	public String addr;
	
	
	
	// 기본 생성자
	public Member() {
		
	};
	
//	class 이름과 같지만 method는 아니다. 
//	이유는? return type이 명시되지 않았다.
//			public void test() {}			=> 리턴 타입 void(없음)
//			public static void test() {}	=> 리턴 타입 void(없음)
//			public int test() {}			=> 리턴 타입 int
// 리턴 타입이 명시되지 않는 메소드 같이 생긴건 생성자
	
	// 값을 3개 전달 받는 생성자(Constructor)
	public Member(int num, String name, String addr) { // 매개변수를 선언
		// 매개 변수에 전달된 값을 필드에 저장하기
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	// 생성자를 직접 만들지 않으면 기본 생성자가 있는데
	// 생성자를 직접 만들면 기본 생성자가 사라진다.
	

	
//	생성자가 여러개 정의되어 있는 클래스 => 생성자 다중정의(overloading)
	
	
	
	
	// 필드에 저장된 정보를 콘솔창에 출력하는 메소드 
//	리턴 없음 -void , 동작만 하고 끝
	public void showInfo() {
		// 필드에 저장된 회원 정보를 1 줄로 예쁘게 콘솔창에 출력하는 코드
		String info = "번호: "+ this.num +" | 이름:" + this.name + " | 주소: " + addr;
		System.out.println(info);
	}
	
	// 매개변수에 전달된 번호를 필드에 저장하고 자신의 참조값을 리턴하는 메소드
	public Member num(int num) {
		this.num = num;
		return this;
	}

	// 매개변수에 전달된 이름를 필드에 저장하고 자신의 참조값을 리턴하는 메소드
	public Member name(String name) {
		this.name = name;
		return this;
	}
	
	// 매개변수에 전달된 주소를 필드에 저장하고 자신의 참조값을 리턴하는 메소드
	public Member addr(String addr) {
		this.addr = addr;
		return this;
	}
	
}
