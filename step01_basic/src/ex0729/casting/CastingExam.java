package ex0729.casting;

class CastingExam{
	public static void main(String []args){
		//실행을 위해서 반드시 필요 시작점 메소드
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1 = (byte)i1 ; // 4byte를 1byte에 담을 수 없다 캐스팅 필요하다
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte)(b2+b1); //b2와 b1은 byte 지만 연산자가 들어가면 int가 되어 에러가 난다

		System.out.println("byte b3="+b3);
		
		long lo=56897L;
		System.out.println("long lo="+lo);

		int i4=(int)(lo+i1); // 8byte를 4byte에 담을 수 없다 캐스팅 필요하다
		//int i4 = (int)lo + i1
		System.out.println("int i4="+i4);
		
		boolean boo;
		 boo=false; // 형변환 안된다
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3;
		System.out.println("double d="+d);

		float f1=lo;
		System.out.println("float f1="+f1);
				
		
	    float f2=(float)d; //8byte는 4byte에 담을 수 없다 캐스팅 필요
		System.out.println("float f2="+f2);

		char c1,c2, c3;
		c1='\u0167';
		System.out.println("char c1="+c1);

		 b2=(byte)c1; //1byte는 2byte에 담을 수 없다 캐스팅 필요
		System.out.println("byte b2="+b2);
		
		c2='A';
		System.out.println("char c2="+c2);
		
		
		c3=(char)(c2+2); //연산자 포함시 int형으로 바뀜
		System.out.println("char c3="+c3);
		
		
	}

}