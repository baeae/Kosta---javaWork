package ex0812;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("***Exception Test***");
		
		System.out.println("args = " + args);
		try {
		System.out.println("args[0] = " + args[0]);
		
		int convertNo = Integer.parseInt(args[0]);
		System.out.println("숫자로 변환 = " + convertNo);
		
		int result = 100 / convertNo;
		System.out.println("나눈결과 = " + result);
		
		// catch 여러개 작성할 때는 반드시 서브클래스 먼저 작성한다.
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			//e를 출력하면 발생한 예외클래스 이름 : 발생한 예외메시지
			System.out.println("인수의 값을 전달해 주세요~ => " + e); // e.toString()호출 ->원래 Object 는 주소가 나와야 하지만 throwable 에서 toString을 override 해놨다.
			
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력하세요 => " + e.getMessage());
		}catch(Exception e) {
			System.out.println("예외가 발생했어요~~~");
			e.printStackTrace();
		}finally {
			System.out.println("예외발생 여부 상관없이 무조건 실행되어요~~");
		}
		
		
		System.out.println("***Exception End***");

	}

}
