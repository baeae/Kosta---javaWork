package ex0807.Inheritance;

class CarCenter{
	public void engineer(Car cd){ // Car cd = c;
		System.out.println("cd = " + cd); // c랑 주소값이 같다
		
		//부모타입을 자식타입변수에 담는다.
		// Efsonata e = cd; // 에러(개념적으로 부모>자녀) (부모를 자식에게 담을 수 없다.)
		//부모타입을 자식타입으로 IbjectDownCasting 해야 한다.
		if(cd instanceof EfSonata) {
			EfSonata e = (EfSonata)cd;
			System.out.println("---------");
			System.out.println("e = " + e);
			System.out.println(e.i);
			System.out.println("---------");
		}
		
		
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
		
		
		
	}
}
////////////////////////////////////////////////////////////////////////
public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car c= new Car();
		
		System.out.println("c = " + c);
		System.out.println("ef = " + ef);
		System.out.println("ca = " + ca);
		System.out.println("ex = " + ex);
		
		System.out.println("ef.i = " + ef.i);
		cc.engineer(c);//
		
		cc.engineer(ef);//
		
		cc.engineer(ca);//
		cc.engineer(ex);//
		
		
	
	}
}
