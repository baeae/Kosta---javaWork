package ex0803.array;

class ArrayValue {
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)

    int arr[] = {1,2,3,4,5,6,7,8,9,10};

    /*printArrayvalue 메소드작성
    => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.

	*/

    public void printArrayvalue() {
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }

    public void printArrayvalue2() {
        System.out.println("arr = " + arr);
        int len = arr.length;

        System.out.println("배열의 길이 = " + len);
    }
}   

/////////////////////////////////////////////////

public class ArrayValueExam {
    public static void main(String[] args) {
    	// ArrayValue에 있는 printArrayvalue메소드 호출

        ArrayValue a = new ArrayValue();

        a.printArrayvalue();

        System.out.println("프로그램 종료");
    }
}