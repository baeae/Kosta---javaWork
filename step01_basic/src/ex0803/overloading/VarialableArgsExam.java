package ex0803.overloading;

public class VarialableArgsExam {
	
	public void aa(int...i) { // int 대신 Object
		System.out.println("i = " + i);
		
		System.out.println("*******************");
	}
	
	public void bb(int i, String ...s ) { // ...은 라스트 파라미터에서 나온다)
		
	}
	

	public static void main(String[] args) {
		System.out.println("==메소드 호출 해보자==");
		
		VarialableArgsExam ve = new VarialableArgsExam();
		ve.aa(5);
		
		ve.aa(5,3,1);;
		ve.aa();;
		ve.aa(1,2,3,4,5,6);;
		
		//ve.aa("안녕");
		
	}
	
}
