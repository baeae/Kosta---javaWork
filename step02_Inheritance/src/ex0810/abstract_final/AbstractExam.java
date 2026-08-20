package ex0810.abstract_final;

abstract class Animal{
	
	int legs;
	
	public abstract void sound();
	
	public abstract void run();
	
	public void eat() {
		System.out.println("잘 먹는다.");
	}
	
}
///////////////////////////////////////////////////////////////

/*abstract*/ class Dog extends Animal{ // abstract 하면 생성이 안됨으로 반드시 오버라이딩 해야한다.
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	@Override
	public void run() {
		System.out.println("잘 뛴다.");
	}
	
}

//////////////////////////////////////////////////////////////
 
class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("야옹");
		
	}

	@Override
	public void run() {
		System.out.println("잘 뛰고, 잘 올라간다.");
		
	}
	
}
////////////////////////////////////////////////////////////////

class Pig extends Animal{

	@Override
	public void sound() {
		System.out.println("꿀꿀");
		
	}

	@Override
	public void run() {
		System.out.println("못 뛴다.");
		
	}
	
	@Override
	public void eat() {
		
		System.out.println("모든 것을 잘 먹는다.");
		
	}
	
}

public class AbstractExam {
	
	public static void test(Animal animal) {// Cat or Dog or Pig, 매개변수를 이용한 다형성
		
		// 각 동물의 메소드 호출 - 부모타입이지만 재정의된 메소드는 자식부분이 호출
		animal.sound();
		animal.run();
		animal.eat();
		System.out.println("---------------------------------------");
		
	}

	public static void main(String[] args) {
		
		Animal an;
		
		an = new Dog(); //필드를 이용한 다형성
		test(an);
		
		an = new Cat();
		test(an);
		
		an = new Pig();
		test(an);
		
		

	}

}
