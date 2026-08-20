package ex0731.report;

/**
 * @author 이금배
 * 날짜 : 7/31 
 * 주제 : 성적 프로그램 v2 
 */

import java.util.Scanner;

public class Grade02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("아래 메뉴를 선택해 주세요.");
			System.out.println("1. 성적표구하기  2. 종료");
			int menuChoice = sc.nextInt();
			
			if (menuChoice == 1) {
				
				System.out.print("이름을 입력해 주세요.(공백없이) ");
				String name = sc.next();
				
				System.out.print("국어점수 입력해주세요. ");
				int kor = sc.nextInt();
				
				System.out.print("영어점수 입력해주세요. ");
				int eng = sc.nextInt();
				
				System.out.print("수학점수 입력해주세요. ");
				int mat = sc.nextInt();
				
				GradeInformation g = new GradeInformation(); // 바깥으로 빼야 한다.
				
				g.input(name, kor, eng, mat);
				
			}else if (menuChoice == 2) {
				break;
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요.(1번 ~ 2번)");
			} // if end
			
		} // while end
		System.out.println("이용해주셔서 감사드립니다.");

	} // main end

} // class end
