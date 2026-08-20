package ex0730.ch04;

import java.util.Scanner;

public class Bank_P140_141 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //키보드 입력받기
		
		while (true) {
			
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.print("예금액> ");
				int in = sc.nextInt();
				
				System.out.println("선택> " + choice);
				System.out.println("예금액> " + in);
			}else if (choice == 2) {
				System.out.print("출금액> ");
				int out = sc.nextInt();
				
				System.out.println("선택> " + choice);
				System.out.println("출금액> " + out);
			}else if (choice == 3) {
				System.out.print("잔고> ");
				int mon = sc.nextInt();
				
				System.out.println("선택> " + choice);
				System.out.println("출금액> " + mon);
			}else if (choice == 4) {
				System.out.print("선택> " + choice);
				System.out.println("\n프로그램 종료");
				break;
			}else {
				System.out.println("잘못 누르셨습니다.");
				System.out.println("1~4번을 입력해 주세요.");
			}
					
			
		}

	}

}
