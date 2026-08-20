package retest;

public class Ex0731_Switch {

	public static void main(String[] args) {
		
		int no = 80;
		switch(no % 5) {
		case 0 -> System.out.println("배수다");
		default -> System.out.println("배수아니다");
		}

	}

}
