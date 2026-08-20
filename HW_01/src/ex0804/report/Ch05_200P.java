package ex0804.report;
/**
 * @author 이금배
 * @ 내용 : 챕터 5 200p 4,5,6,8번
 * @ 날짜 : 8월 4일
 */

public class Ch05_200P {

	public static void main(String[] args) {
		
		//4. 배열을 생성하는 방법으로 틀린 것은 ?
		//	2번 int[] array; array = { 1, 2, 3 }; -> 중과로 는 선언과 동시에 쓸때만 허용
		
		//5. 배열의 기본 초기값에 대한 설명으로 틀린 것은?
		//	3번. boolean 타입 배열 항목의 기본 초기값은 true 이다. -> false 이다.
		
		//6.실행결과
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.print(array.length); // 행의 개수
		System.out.println("\t" + array[2].length); // 3행의 길이 -> 5
		
		System.out.println("---------------------------------------------");
		//8. 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해 보세요(중첩 for 문 이용)
		
		int[][] arr = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0 ; i < arr.length ; i++) { //3 
			for(int j = 0 ; j < arr[i].length ; j++) {
				
				
				sum += arr[i][j];
				count++;
			}
		}
		
		double avg = (double) sum / count;
		
		System.out.println("전체 합 : " + sum);
		System.out.println("전체 평균 : " + avg);

	}

}
