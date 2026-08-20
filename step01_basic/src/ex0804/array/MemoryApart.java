package ex0804.array;

class MultiArray{
	//정수형 2차원 배열 8*9
	
	int ar [][] = new int[8][9];
	
	
		
	//메소드이름 :array99
		public void array99() {
			
			for(int i = 0; i < ar.length; i++) {	
				for(int j = 0; j < ar[i].length; j++ ) {
					
					ar[i][j] = (i + 2)*(j + 1);
					
					System.out.print(ar[i][j] + "\t");
				}
				System.out.println();
			}
			//for loop 를 사용하여 
			//배열에 곱한 (구구단)결과저장
			//배열에 결과를 꺼내출력
		}// arry 메소드 end
	
		
			
			
}// class end


public class MemoryApart{
	public static void main(String[] args) {
		// 일회성일 경우 new MultiArray().array99(); 
		MultiArray ma = new MultiArray();
		ma.array99();
	}
	//main메소드에서 
	//MultiArray객체의 array99메소드호출
		
}

