package ex0729.제어문;

public class SwitchExam01 {

	public static void main(String[] args) {
		//1~ 12사이 난수 발생 해서 변수에 담는다.
		
		int day = (int)(Math.random()*12 + 1);
				
		//발생한 난수가 1이면 일요일, 2이면 월요일, 3이면 화요일, 4이면 수요일
		// 5이면 목요일 6이면 금요일, 이외의 수는 토요일 출력한다.
		
		/*
		switch(day) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		default : System.out.println("토요일");
		} */
		
		String yoil = "토요일";
		switch(day) {
		case 1 : yoil = "일요일"; break;
		case 2 : yoil = "월요일"; break;
		case 3 : yoil = "화요일"; break;
		case 4 : yoil = "수요일"; break;
		case 5 : yoil = "목요일"; break;
		case 6 : yoil = "금요일"; break;
		default : yoil = "토요일"; 
		}
		System.out.println(day + "는 " + yoil + " 입니다." );

	}
}
