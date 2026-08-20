package ex0805.constructor;
class Puppy3{
	/*String 타입 전역 변수 선언
	  int 타입 전역 변수 선언*/
	String str;
	int in;
	
	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
	public Puppy3() {
		this.str = "메리";
		
		System.out.println("puplic Puppy3()호출되었습니다");
		System.out.println("전역변수 str = " + str + ", in = " + in);
	}
	
	
	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	public Puppy3(String a) {
		this.str = a;
		
		System.out.println("puplic Puppy3()호출되었습니다");
		System.out.println("전역변수 str = " + str + ", in = " + in);
	}
		
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/
	public Puppy3(String a, String b) {
		this(a + b);
		
		System.out.println("puplic Puppy3()호출되었습니다");
		
	}
		
	
	
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/
	public Puppy3(boolean a) {
		this(a + "쫑");
		
		System.out.println("puplic Puppy3()호출되었습니다");
	}
	
	
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/
	public Puppy3(char a) {
		this();
		
		this.in = a;
		System.out.println("puplic Puppy3(char a)호출되었습니다");
		System.out.println("전역변수 : " + this.in);
	}
		
	
	
	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/	
	public void printMemberVariable() {
		System.out.println("전역변수 str = " + str);
		System.out.println("전역변수 in = " + in);
	}
		

	
}

public class ConstructorOverloadingExam{
		//메인메소드에서
		public static void main(String [] args){
			//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
			Puppy3 a = new Puppy3();
			System.out.println("==================1===============");
			Puppy3 b = new Puppy3("java", "python");
			System.out.println("==================2===============");
			Puppy3 c = new Puppy3("java");
			System.out.println("==================3===============");
			Puppy3 d = new Puppy3(true);
			System.out.println("==================4===============");
			Puppy3 e = new Puppy3('A');
			System.out.println("==================5===============");

			//같은 Puppy3 지만 주소값은 다 다르다.
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
	
			
		//각 객체의 printMemberVariable메소드를 한번씩 호출
			a.printMemberVariable();
			b.printMemberVariable();
			c.printMemberVariable();
			d.printMemberVariable();
			e.printMemberVariable();
	}
}