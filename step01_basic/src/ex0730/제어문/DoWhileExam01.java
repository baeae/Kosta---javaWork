package ex0730.제어문;

public class DoWhileExam01 {

	public static void main(String[] args) {
		//1. 1~ 100가지 한줄로 출력
		int a = 1;
		do {
			System.out.print(a + " ");
			a++;
		}while (a <= 100);

		System.out.println("---------------------------------------");
		//2. A ~Z 까지 한줄로 출력
		int b = 0;
		do {
			System.out.print((char)('a' + b ));
			b++;
		}while(b < 26);

				//3. 1~ 10 까지  합 구해서 출력

				//4. 1 ~ 100 사이의 7의 배수만 출력 

				//5. 100 ~ 1 사이의 5 의 배수만 출력 
				
				////////////////////////////////////////////////////////////

				//1.  1 ~ 100가지 10행 10열로 출력 (do_while문 안에 do_while문이용)
				//2. 1 ~ 100가지 10행 10열로 출력 (do_while문 안에  if문이용)

				//3. 구구단 출력  -  do_while 문안에 do_while 문이용
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
