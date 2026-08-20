package ex0730.제어문;

public class WhileExam01 {

	public static void main(String[] args) {
		//1. 1~ 100가지 한줄로 출력
		
		int i = 1;
		while( i <= 100) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();

		//2. A ~Z 까지 한줄로 출력
		
		int a = 0;
		while(a < 26) {
			System.out.print((char)('a' + a));
			a++;
		}
		
		System.out.println();

		//3. 1~ 10 까지  합 구해서 출력
		
		int b = 1;
		int sum = 0;
		while(b <= 10) {
			sum += b;
			b++;
		}
		System.out.println("총합 = " + sum);

		//4. 1 ~ 100 사이의 7의 배수만 출력 
		
		int c = 1;
		while(c <= 100) {
			if(c % 7 == 0) {
				System.out.print(c + "\t");
			}
			c++;
		}
		
		System.out.println();

		//5. 100 ~ 1 사이의 5 의 배수만 출력 
		
		int d = 100;
		while(d >= 1) {
			if(d % 5 == 0) {
				System.out.print(d + "\t");
			}
			d--;
		}
		
		////////////////////////////////////////////////////////////
		System.out.println();
		//1.  1 ~ 100가지 10행 10열로 출력 (while문 안에 while문이용)
		
		int row = 0;
		while(row < 100) {
			
			int col = 1;
			while(col <= 10) {
				System.out.print(col + row + " ");
				col++;
			}
			System.out.println();
			
			row += 10;
			
		}
		
		System.out.println("---------------------------");
		//2. 1 ~ 100가지 10행 10열로 출력 (while문 안에  if문이용)
		int col_1 = 1;
		while (col_1 <= 100) {
			
			if (col_1 % 10 == 0) {
				System.out.println(col_1);
			}else {
				System.out.print(col_1 + " ");
			}
			
			col_1++;
		}
		
		System.out.println("---------------------------");

		//3. 구구단 출력  -  while 문안에 while 문이용
		
		int g = 1;
		while( g <= 9) {
			
			int ga = 2;
			while( ga <= 9) {
				System.out.print(ga + "*" + g + "=" + (ga*g) + "\t");
				ga++;
			}
			System.out.println();
			g++;
			
		}
		
		
		/*
				 * 
				 *  2*1=2  3*1=3 ..... 9*1=9
				 *  2*2=4  3*2=4  4*2=4
				 *  2*3=6
				 *  ..
				 *  
				 *  2*9=18              9*9=81
				 * 
				 * */	

	}

}
