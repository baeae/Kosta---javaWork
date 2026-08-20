package ex0807.Inheritance;


class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost);
		}
}

//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
	//각 클래스에 인수를 받지않는 생성자 작성
	//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당

class EfSonata extends Car{
	int i = 10;
	
	public EfSonata() {		
		this.carname = "소나타";
		this.cost = 100;
	} //생성자 end
}// class end

class Excel extends Car{
	public Excel() {
		this.carname = "엑셀";
		this.cost = 200;
	}
}

class Carnival extends Car{
	public Carnival() {
		this.carname = "카니발";
		this.cost = 300;
	}
}	
	

public class InheritanceExam{
	//메인메소드에서 
	public static void main(String[] args) {
		//Car, EfSonata, Excel, Carnival 네개의 객체를 생성
		// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel ex = new Excel();
		Carnival ca = new Carnival();
		
		System.out.println("--------------------");
		System.out.println("Car = " + car);
		System.out.println("EfSonata = " + ef);
		System.out.println("Excel = " + ex);
		System.out.println("Carnival = " + ca);
		
		System.out.println("--------------------");
		car.printAttributes();
		ef.printAttributes();
		ex.printAttributes();
		ca.printAttributes();
		System.out.println("--------------------");
		
	}
	
		
		
	
}

