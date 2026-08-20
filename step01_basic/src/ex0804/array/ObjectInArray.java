package ex0804.array;

//ObjectInArray.java

class ObjectOne{
	public int a;
}

public class ObjectInArray{
	//메인 메소드에서 
	public static void main(String[] args) {
		
		//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
		ObjectOne [] ob = new ObjectOne[5]; // 5개의 배열을 만든것 뿐이다.
		
		System.out.println("--배열방 기본값 --");
		
		//5개의 ObjectOne객체를 생성하세요.
				//각 객체가 갖고있는 전역변수 출력
		for(int i = 0; i < ob.length; i++) {
			System.out.print("생성전 : " + ob[i] + "\t");
			
			ob[i] = new ObjectOne();
			System.out.print("생성후 : " + ob[i] + "\t");
			
			// 각 개체의 a값 출력
			System.out.print("ob[" + i + "].a = " + ob[i].a + "\t");
			
			// 각 객체의 a의 값을 변경
			ob[i].a = i+1;
			System.out.println("후 : ob[" + i + "].a = " + ob[i].a + "\n");
		}
		
		/////////////////////////////////개선된 for 문 ////////////////////////////////////////
		for(ObjectOne obj : ob) {
			System.out.println(obj + " , " + obj.a);
		}
		
		
		
		
		
		
		
	
	}
	
		//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
		 
		//5개의 ObjectOne객체를 생성하세요.
		//각 객체가 갖고있는 전역변수 출력
		//각 객체의 주소값 출력
			
		//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.			
		//각 ObjectOne 객체의 a를 출력하세요
			
		
	
}

