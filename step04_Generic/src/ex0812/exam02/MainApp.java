package ex0812.exam02;

public class MainApp {

	public static void main(String[] args) {
		//상품 생성
		Product<Tv, String> p1 = new Product<Tv, String>();
		p1.setKind(new Tv());
		p1.setModel("삼성 tv");
		
		Tv tv = p1.getKind();
		String model = p1.getModel();
		
		///////////////////////////////////////////////////////
		
		Product<Vedio, Integer> p2 = new Product<>();
		p2.setKind(new Vedio());
		p2.setModel(5);//AutoBoxing
		
		Vedio vedio = p2.getKind();
		int model2 = p2.getModel();//UnBoxing
		
		
		
		
		
		
	}

}
