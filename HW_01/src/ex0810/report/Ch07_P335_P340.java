package ex0810.report;

public class Ch07_P335_P340 {
		
		/*
		1. 자바의 상속에 대한 설명 중 틀린 것은 무엇입니까? 1) 
			1) 자바는 다중 상속을 허용한다.
			2) 부모의 메소드를 자식 클래스에서 재정의(오버라이딩) 할 수 있다.
			3) 부모의 private 접근 제한을 갖는 필드와 메소드는 상속의 대상이 아니다.
			4) final 클래스는 상속 할 수 없고, final 메소드는 오버라이딩 할 수 없다.
			
		2. 클래스 타입 변환에 대한 설명 중 틀린 것은 무엇입니까? 2) 캐스팅으로 변환할 수 있다 ?
			1) 자식 객체는 부모 타입으로 자동 타입 변환된다.
			2) 부모 객체는 어떤 자식 타입으로도 강제 타입 변환된다.
			3) 자동 타입 변환을 이용해서 필드와 매개변수의 다형성을 구현한다.
			4) 강제 타입 변환 전에 instanceof 연산자로 변환 가능한지 검사하는 것이 좋다.
			
		3. final 키워드에 대한 설명으로 틀린 것은 무엇입니까? 1) final 클래스는 상속 할 수 없다.
			1) final 클래스는 부모 클래스로 사용할 수 있다.
			2) final 필드는 초기화된 후에는 변경 할 수 없다.
			3) final 메소드는 재정의(오버라이딩)할 수 없다.
			4) static final 필드는 상수를 말한다.
			
		4. 오버라이딩 에 대한 설명으로 틀린 것은 무엇입니까? 4) private 접근 제한을 갖는 메소드는 재정의 할 수 없다.
			1) 부모 메소드의 시그너처(리턴타입, 메소드명, 매개변수)와 동일해야 한다.
			2) 부모 메소드보다 좁은 접근 제한자를 붙일 수 없다.( 예: public(부모) -> private(자식))
			3) @Override 어노테이션을 사용하면 재정의가 확실한지 컴파일러가 검증한다.
			4) protected 접근 제한을 갖는 메소드는 다른 패키지의 자식 클래스에서 재정의 할 수 없다.
			
		5. 추상 클래스에 대한 설명으로 틀린 것은 무엇입니까? 2) 반드시 가져야하는거는 아니다.(추상메소드가 있으면 추상클래스를 반드시 가져야 한다.
			1) 직접 객체를 생성할 수 없고, 상속만 할 수 있다.
			2) 추상 메소드를 반드시 가져야 한다.
			3) 추상 메소드는 자식 클래스에서 재정의 할 수 있다.
			4) 추상 메소드를 재정의 하지 않으면 자식 클래스도 추상클래스가 되어야 한다.
			*/
	

}


/*//6번
class Parent{
	public String name;
	
	public Parent(String name) {
		this.name =name;
	}
}

class Child extends Parent{
	
	public int studentNo;
	
	public Child(String name, int studentNo) {// 부모 클래스에 기본 생성자가 없는데, 자식클래스에서 부모생성자를 호출하지 않아서 생김 ->
		super(name);						// 자식생성자 첫줄에 super(); 호출                      
		this.studentNo = studentNo;
		
		
	}
}*/


/* // 7번 결과 출력
class Parent{
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		
		this.nation = nation;
		System.out.println("Parent(String nation) call");
		
	}
	
}

class Child extends Parent{
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name} call");
	}
	
}

public class ChildExample{
	public static void main(String[] args) {
		Child child = new Child();
		//Parent(String nation) call
		//Parent() call
		//Child() call
		//Child(String name} call
	}
	
}*/

/*//8번 결과출력
class Tire{
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class SnowTire extends Tire{

	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
	
}

class SnowTireExample{
	public static void main(String [] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
		// 스노우 타이어가 굴러갑니다.
		// 스노우 타이어가 굴러갑니다.
		
	}
}*/

/*//9번. A, B, C, D, E, F 클래스가 다음과 같이 상속관계에 있을 때 다음 빈칸에 들어올 수 없는 코드를 선택하세요. 2)  부모객체가 자식 개체로 생성되었을때 강제 형변환 가능
 * 	1) newB() 2) (B)new A() 3) new D() 4) new E()
	//변수대입
		B b = 
	
	//메소드 선언
		void method(B b){  }
		
	//메소드 호출
		method(		)
*/		

// 10번. 컴파일에러난 이유 -> abstract 된 메소드를 재정의 하지 않아서 컴파일 에러가 났다.
/*
abstract class Machine{
	public void powerOn() {
		
	}
	public void powerOff() {
		
	}
	public abstract void work();
}

class computer extends Machine{

	
}*/

/*//11번 코드 작성 -> 정답) .앞에 super 추가

class Activity{
	public void onCreate() {
		System.out.println("기본적인 실행 내용");
	}
}

class MainActivity extends Activity{
	
	
	
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("추가적인 실행 내용");
	}
}*/


//12번 -> if 괄호 채우기 정답)  a instanceof C c
class A{
	public void method1() {
		System.out.println("A-method1()");
	}
}

class B extends A{
	public void method1() {
		System.out.println("B-method1()");
	}
}

class C extends A{
	public void method1() {
		System.out.println("c-method1()");
	}
	public void method2() {
		System.out.println("c-method2()");
	}
}

class Example{
	public static void action(A a) {
		a.method1();
		if(  a instanceof C c ) {
			c.method2();
		}
	}
	public static void main(String [] args) {
		action(new A());
		action(new B());
		action(new C());
	}
	
}






