package ex0729.연산자;

class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t = true ;
		boolean f = false;
		System.out.println("true&false="+(t&f)); //true&false = false
		System.out.println("true&true="+(t&t)); //true&true = true
		System.out.println("false&false="+(f&f)); //false&false = false
		System.out.println();
	
		System.out.println("true|false="+(t|f)); //true|false = true
		System.out.println("true|true="+(t|t)); //true|true = true
		System.out.println("false|false="+(f|f)); //false|false = false
		System.out.println();

		System.out.println("true^false="+(t^f)); //true^false = true
		System.out.println("true^true="+(t^t)); //true^true = false
		System.out.println("true^false="+(t^f)); //true^false = true
		System.out.println("true^true="+(t^t)); //true^true = false
		System.out.println();

		System.out.println("true&&false="+(t&&f)); //true&&false= false
		System.out.println("true&&true="+(t&&t)); //true&&true = true
		System.out.println("true&&false="+(t&&f)); //true&&false= false
		System.out.println("false&&false="+(f&&f)); //false&&false = false
		System.out.println();

		System.out.println("true||false="+(t||f)); // true||false = true 
		System.out.println("true||true="+(t||t)); // true||true = true
		System.out.println("false||false="+(f||f)); // false||false = false
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j); //int i = 5 int j = 3
		System.out.println("i>=j==>>"+(i>=j)); // i>=j==>> true
		System.out.println("i>j=>>"+(i>j)); // i>j=>> true
		System.out.println("i<=j=>>"+(i<=j)); // i<=j=>> false 
		System.out.println("i<j=>>"+(i<j)); // i<j=>> false
		System.out.println("i==j=>>"+(i==j)); // i==j=>> false
		System.out.println("i!=j=>>"+(i != j)); // i!=j=>> true

		System.out.println("-----------------");
		// | or || 비교
		System.out.println("결과 : " + (true | test())); // test()호출됨
		System.out.println("결과 : " + (true || test())); // test()호출안됨
	}
	
	public static boolean test() {
		System.out.println("test call...");
		return true;
	}
		
}