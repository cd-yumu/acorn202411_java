package test.main;

import java.util.Random;
import java.util.Scanner;

/*
 * 게임 규칙
 * 한 게임 가동 시 -100
 * 한 줄 맞으면 +100 
 * 그 한 줄이 체리면 + 100
 * 그 한 줄이 사과면 + 200
 * 그 한 줄이 바나나면 + 300
 * 그 한 줄이 메론이면 + 400
 * 그 한 줄이 7 이면 + 700
 * 
 */

public class MainClass04 {

	public static void main(String[] args) {
		
		
		// 게임 가동 여부 확인
		boolean isPlay = false;
		
		System.out.println("슬롯 머신 게임 할래? Y / N");
		
		
		
		
		
		
		
		

		// String type 이 저장되어 있는 배열
		String[] data = {"🍒", "🍎", "🍌", "🍈", "7"};
		int[] idx = new int[3];
		
		// 배열에 저장된 문자열에 1개가 랜덤하게 콘솔창에 출력되도록 프로그래밍 해보세요
		Random ran = new Random();
		
		
		Scanner scan = new Scanner(System.in);

		// 기본 점수
		int score = 1000;
		
		while(true) {
			
			System.out.println("현재 잔액은 "+ score +"입니다.\n"
					+ "한 게임 당 100원이 소진됩니다.\n"
					+ "진행하려면 Enter 를 치세요");
			scan.nextLine();
			
			// score 를 10씩 감소 시키기
			score -= 100;
			System.out.println("슬롯 머신 가동 -100원\n"
					+ "현재 잔액은 " + score + "입니다.\n"
					+ "↓ 슬롯 머신 가동 결과 ↓\n");
			
			
			for(int i = 0; i<3; i++) {
				int ranNum = ran.nextInt(5);
				System.out.print(data[ranNum]+"\t");
				
				idx[i] = ranNum;
			}
			System.out.println("\n");
			
			// 나왔던 랜덤한 정수가 모두 값으면 100 점, 하나라도 다르면 0점을 출력
			if(idx[0] == idx[1] && idx[1] == idx[2]) {
				System.out.println("획득한 금액: 100");
				score += 100;
			}else {
				System.out.println("획득한 금액: 0");
				
			}
			
			System.out.println("현재 잔액: " + score);
			System.out.println("-----------------------------------");
			
			if(score <= 0) {
				System.out.println("Game Over! 파산입니다.");
				break;
			}
			
		}
	}
}
