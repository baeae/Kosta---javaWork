package ex0731.report;

/**
 * @author 이금배
 * 날짜 : 7/31 
 * 주제 : 성적 프로그램 v2 (메소드)
 */

public class GradeInformation {
	
	private int total(int a, int b, int c) {
		
		int i = a + b + c;
		
		return i;
	} // total end
	
	
	private int average(int a, int b, int c) {
		
		int t = total(a, b, c);
		
		int i = t / 3;
		
		return i;
	} // average end
	
	
	private char unit(int a, int b, int c) {
		
		int u = average(a, b, c);
		
		char grade;
		
		if ( u >= 90) grade = 'A';
		else if ( u >= 80) grade = 'B';
		else if ( u >= 70) grade = 'C';
		else if ( u >= 60) grade = 'D';
		else grade = 'F';
		
		return grade;
	} // unit end
	
	
	public void input(String a, int b, int c, int d) {
		
		int total = total(b, c, d);
		int average = average(b, c, d);
		char unit = unit(b, c, d);
		String name = a;
		
		System.out.println("----------------------");
		System.out.println(name + "님 성적 입니다.");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		System.out.println("학점 : " + unit);
		System.out.println("----------------------");
		
	} // input end
	

} // class end
