package step05_Lamda;


public class MainApp {

	public static void main(String[] args) {
		//기존방식
		//AInterface ai = new Test();
		
		// ai.aa();
		
		//2. 익명의 이너클래스(AnonymousInnerclass) 타입으로 작성
		/*AInterface ai = new AInterface() {// 생성이 아님, 딱 한번 사용, 타입 선언과 동시에 구현까지 같이진행
			
			@Override
			public void aa() {
				System.out.println("익명의 이너클래스 aa호출");
				
			}
		}; // Ainterface end
		
		ai.aa();*/
		
		/*3. 람다식
		 *  반드시 인터페이스 안에 메소드 한개 있을 경우에 사용 할 수 있다.
		 *  FunctionalInterface라고 한다.
		 *  
		 *  	문법 
		 *  	1) 인수가 없는경우
		 *  	() -> {}
		 *  
		 *  	2) 인수가 있는 경우
		 *  	(변수이름,...) -> {}
		 *  
		 *  	3) 기능이 한문장인경우
		 *  	() -> 기능
		 */
		/*AInterface ai = ()->{
			System.out.println("인수없는 람다식 호출");
		};*/
		
		AInterface ai = ()-> System.out.println("인수없는 람다식");
		ai.aa();
		
		///////////////////////////////////////////////
		
		BInterface bi = (a)-> System.out.println(a + "가 전달된 람다식");;
		bi.bb(7);
		
		/////////////////////////////////////////////////
		
		/*CInterface ci = (a,b) -> { //return 사용시 return 자체가 한문장임으로 중과로 생략 불가
			return a+b;
		};*/
		
		CInterface ci = (a,b) -> a + b;
		int re = ci.cc(5, 8);
		System.out.println("re = " + re);

	}//main end

}//class end
////////////////////////////////////////////////////////////

class Test implements AInterface{

	@Override
	public void aa() {
		System.out.println("Test의 aa메소드입니다.");
		
	}
	
	
}



