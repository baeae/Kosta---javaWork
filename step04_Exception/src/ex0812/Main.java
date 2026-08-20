package ex0812;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("***Shoppingmall OPEN*****");
		
		
		//난수발생 전용 클래스
		Random r = new Random();
		
		ShoppingMall sh = new ShoppingMall();
		
		for (int i = 0; i < 10; i++) {
			//난수발생
			int age = r.nextInt(55)+1;
			try {
				sh.enter(age);
			}catch(NokidsException e) {
				System.out.println(e.getMessage());
			}
		
			
		
			
		}
		
		System.out.println("***Shoppingmall Close*****");
		
		System.out.println("예외 개수 = " + NokidsException.count);
	}

}
