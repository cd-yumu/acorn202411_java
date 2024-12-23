package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain2 {

	public static void main(String[] args) {
		// 1. 로또 번호를 담을 HashSet 객체를 생성해서 set1 이라는 지역 변수에 담기
		Set<Integer> set1 = new HashSet<>();
		
		// 2. while 문을 이용해서 랜덤한 로또 번호를 set1 에 반복적으로 담아보기
		// while 문 탈출 조건은 set1.size() 가 6 이 되면 탈출
		Random ran = new Random();
		while(set1.size() < 6) {
			set1.add(ran.nextInt(45) + 1);
		}
		
//		선생님 코드
//		while(true) {
//			// 1~45 사이의 랜덤한 숫자를 얻어서
//			int ranNum = ran.nextInt(45) + 1;
//			// Set 객체에 담는다
//			set1.add(ranNum);
//			// 만일 Set 의 크기가 6이면 반복문 탈출
//			if(set1.size()==6) {
//				break;
//			}
//		}
		
		
		// 3. set1 에 담긴 번호를 오름 차순 정렬해서 콘솔창에 모두 출력해 보세요
		List<Integer> lotNum = new ArrayList<>(set1);
		Collections.sort(lotNum);
	
		lotNum.forEach((num)->{
			System.out.print(num+"\t");
		});
		
//		선생님 코드
//		for(Integer tmp:lotNum) {
//			System.out.print(num+"\t");
//		}
		

	}
}
