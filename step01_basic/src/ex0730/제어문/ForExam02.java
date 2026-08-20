package ex0730.제어문;

public class ForExam02 {

	public static void main(String[] args) {
		//1.  1 ~ 100가지 10행 10열로 출력 (for문 안에 for문이용)
		
		for (int i = 0 ; i < 100 ; i += 10) { // 0에서 10씩 증가함으로 100 보다 작은 숫자 임으로 10*10씩 10번 돌아감
			for (int j = 1 ; j <= 10 ; j++) {
				System.out.print(j + i + " ");
			}
			System.out.println();
		}
		
		
		//2. 1 ~ 100가지 10행 10열로 출력 (for문 안에  if문이용)
		
		
		

		//3. 구구단 출력  -  for 문안에 for문이용
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
