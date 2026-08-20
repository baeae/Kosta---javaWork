package ex0803.report;

/**
 * @author 이금배
 * 날짜 : 8/3 
 * 주제 : 챕터 5, 연습문제 7번(201p)
 */

public class Max_Ch05_201P {

	public static void main(String[] args) {
		
		int [] array = {1, 5, 3, 8, 2};
		
		// int max = Integer.MIN_VALUE; // -2의 31승 int 가 표현할 수 있는 최솟값을 넣어 놓고 시작하는것이 좋다
		
		int len = array.length;
		
		int max = array[0];
		for (int i = 1; i < len; i++) {
			if ( array[i] > max ) {
				max = array[i];
			}
		}
		
		System.out.println("최댓값 : " + max);

	}//main end

}// class end
