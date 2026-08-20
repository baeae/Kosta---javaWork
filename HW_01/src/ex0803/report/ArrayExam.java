package ex0803.report;

/**
 * @author 이금배
 * 날짜 : 8/3 
 * 주제 : 1차 배열 연습
 */
class ArrayExam{
	
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	int [] intArr = new int [5]; // 0
	double[] doubleArr = new double[5]; // 0.0
	char [] charArr = new char [5]; // 공백
	boolean [] booleanArr = new boolean [5]; //false
	String [] strArr = new String [5]; //null
	
	// ArrayExam ae; 변수선언가능 객체니까


	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	public void printArrayValue01() {
		/*
		System.out.println(intArr[4]);
		System.out.println(doubleArr[4]);
		System.out.println(charArr[4]);
		System.out.println(booleanArr[4]);
		System.out.println(strArr[4]);
		*/
		
		for(int index=0; index < 5 ; index++){
            System.out.println(intArr[index]);
			   System.out.println(doubleArr[index]);
			   System.out.println(charArr[index]);
			   System.out.println(booleanArr[index]);
			   System.out.println(strArr[index]);
			   System.out.println("---------------");
		}
		
	}

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	public void printArrayValue02() {
		
		
		intArr = new int[] {1, 2, 3, 4, 5};
		doubleArr = new double[]{0.1, 0.2, 0.3, 0.4, 0.5};
		charArr = new char[]{'a', 'b', 'c', 'd', 'e'};
		booleanArr = new boolean[]{true, true, false, false, true};
		strArr = new String[]{"자바", "자바스크립트","파이썬","리엑트","스프링"};
		
		
		
		
	}
	
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	public void printArrayValue03() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("===========");
			System.out.println(intArr[i]);
			System.out.println(doubleArr[i]);
			System.out.println(charArr[i]);
			System.out.println(booleanArr[i]);
			System.out.println(strArr[i]);
			System.out.println("===========");
		}
	}
	
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	public static void main(String[] args) {
		ArrayExam ae = new ArrayExam();
		
		ae.printArrayValue01();
		ae.printArrayValue02();
		ae.printArrayValue03();
		
	}
	
}