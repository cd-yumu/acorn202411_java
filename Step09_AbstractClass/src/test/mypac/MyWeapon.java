package test.mypac;

public class MyWeapon extends Weapon{

	// 부모 클래스의 추상메소드를 반드시(강제로) 오버라이드 해야 한다.
	@Override
	public void attack() {
		// 어디를 공격할지는 프로젝트 상황에 맞게 마음대로 공격하면 된다.
		System.out.println("지상 공격을 해요!");
	}
	
//	부모 클래스에 특별한 기능을 제공하는 미리 만들어져 있는 클래스
//	를 상속 받아
//	우리의 프로젝트 상황에 맞게 구현한다.
	
	
	
}
