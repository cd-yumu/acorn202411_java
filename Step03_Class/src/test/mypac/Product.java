package test.mypac;

// 상품 하나의 정보를 담을 객체를 생성할 클래스 정의하기
public class Product {
	private int id;
	private String name;
	private int price;
	
//	java 에서는 공개된 필드를 잘 사용하지 않는다.
//	필드는 메소드에서 사용하는 값을 주로 담고 있는데
//	그걸 public 으로 공개 해버리면 잘못된 동작을 할 가능성이 생긴다.
//	그래서 필드는 가려놓는 것이 일반적이다. (특별한 경우를 제외하고는)
	
	// 디폴트 생성자
	public Product() {};
	
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// 생성자 생성
	// alt + shift + s 혹은 우클릭 constructor
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	};
	
	// 생성자 생성
	// alt + shift + s 혹은 우클릭 constructor
	
}
