package test.mypac;

// 꺽쇠가로 안에는 Type 이라는 의미의 문자 T 를 쓴 것이다. 다른 문자도 상관 없음
public class FruitBox<T> {
// 포괄 클래스 : 클래스 정의시에 타입을 지정하지 않고 정의
// Generic Class
	
	
	// 클래스 정의시에 특정 type 을 전달 받아 사용하는 구조로 정의할 수 있다.
	// 그러한 클래스를 Generic 클래스라고 한다.
	
	private T item;
	
	public void pack(T item) {
		this.item = item;
	}
	
	public T unPack() {
		return item;
	}
}
