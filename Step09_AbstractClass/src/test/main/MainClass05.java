package test.main;

import test.mypac.Weapon;

public class MainClass05 {

	public static void main(String[] args) {
		
		// 익명의 inner class 를 이용해서 Weapon type 의 참조값을 얻어내서 변수에 담은 다음
		Weapon w1 = new Weapon() {	// <- class 익명 extends Weapon{ } 		//익명 클래스
			@Override
			public void attack() {
				System.out.println("몰라 아무데나 공격해");
			}
		};
		
		// 메소드 호출하면서 전달하기
		useWeapon(w1);	
		// 메소드 호출하면서 즉석에서 Weapon type 의 참조값을 얻어내서 전달하기
		// 익명 클래스를 이용해서 추상 클래스를 불러냈다
		useWeapon(new Weapon() {	
			@Override
			public void attack() {
				System.out.println("헐 이렇게도 쓴다고?");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}