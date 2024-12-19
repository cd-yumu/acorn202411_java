package test.main;

import test.mypac.Weapon;

public class MainClass05 {

	public static void main(String[] args) {
		
		// 
		
		
		Weapon w1 = new Weapon() {	// <- class 익명 extends Weapon{ } 		//익명 클래스
			@Override
			public void attack() {
				System.out.println("몰라 아무데나 공격해");
			}
		};
		
		useWeapon(w1);
		
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
