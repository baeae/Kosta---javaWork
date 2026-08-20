package ex0812;

public class ShoppingMall {
	
	public void enter(int age) throws NokidsException {
		
			if (age < 18) {
				
				throw new NokidsException();
				
			}else {
				System.out.println(" 환영 합니다. ");
			}
		
		
		
	}

}
