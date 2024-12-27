package test.dto;

public class MemberDTO {
	// 필드 선언
	private int num;
	private String name;
	private String addr;
	
	// 디폴트 생성자
	public MemberDTO() {}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
