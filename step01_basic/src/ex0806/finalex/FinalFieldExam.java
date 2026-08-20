package ex0806.finalex;

public class FinalFieldExam {
	
	/**
	 * final 필드는 반드시 초기화 필수
	 * -> 초기화를 하는 방법
	 *	  1) 직접 명시적 초기화
	 *	  2) 생성자 안에서 초기화
	 *
	 * static final 필드는 상수이다.
	 * 	  1) 직접 몇시적 초기화, 생성자안에서 초기화 못함.
	 * 	  2) static 블럭에서 초기화 가능
	 */
	
	int i;
	//final int j = 100; // final은 값변경 불가인 고정값
	final int j;
	
	// static final int k = 10;
	static final int PRODUCT_PRICE;
	
	static {
		PRODUCT_PRICE = 40;
	}
	
	public FinalFieldExam() {
		j = 50;
	}
	
	public FinalFieldExam(int j) {
		this.j = j;
	}

	public static void main(String[] args) {
		FinalFieldExam fe = new FinalFieldExam();
		FinalFieldExam fe2 = new FinalFieldExam(100);
		
		fe.i = 5; // 값 변경
		// fe.j = 5; // The final field FinalFieldExam.j cannot be assigned
		

	}

}
