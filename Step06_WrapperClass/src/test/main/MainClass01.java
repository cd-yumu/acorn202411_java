package test.main;

/*
 *  [ 기본 Data Type 의 참조 Data Type ]
 *  
 *  byte	: Byte
 *  short	: Short
 *  int		: Integer
 *  long	: Long
 *  
 *  float	: Float
 *  double	: Double
 *  
 *  char	: Character
 *  boolean	: Boolean
 *  
 *  - 때로는 기본 데이터 type 의 참조 데이터 type 이 필요할 때가 있다.
 *  - 기본 데이터 type 을 객체에 포장(boxing)하는 형태이다.
 *  - boxing 과 unboxing 은 자동으로 되기 때문에 프로그래머가 신경쓸 필요는 없다.
 *  
 */

public class MainClass01 {

	public static void main(String[] args) {
		Byte b = 10;
		Short s = 20;
		Integer i = 30;
		Long l = 40L;
		
		Float f = 10.1f;
		Double d = 10.2d;
		
		Character c = 'a';
		Boolean isRun = true;
	}

}


//참조 데이터 타입
//숫자를 어디에 저장하고 싶은데 기본 데이터 타입이 저장되지 않는 곳이 있다.
//객체에 포장한 다음에 저장하는 방법이 있는데 이 때사용하는 것이 랩퍼클래스
//포장은 자동으로 되기에 오토박싱 - 신경쓸 필요가 없다.






