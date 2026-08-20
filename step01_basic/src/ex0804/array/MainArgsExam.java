package ex0804.array;

public class MainArgsExam {

	public static void main(String[] args) {
		System.out.println("args = " + args);
		System.out.println("args.length = " + args.length);
		
		//args 배열방에 있는 값 모두 출력
		System.out.println(args[0]);
		
		for(int i = 1; i < args.length; i++ ) {
			System.out.println(args[i]);
		}
		
		System.out.println("--- 개선된 for ---");
		for(String s : args) {
			System.out.println(s);
		}

	}

}

/* 실행할때
 * java 파일이름 값 값 값..............
 * 
 * 키보드 입력은 실행중일때
*/