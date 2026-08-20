package ex0811.exam;

public class Tv extends Elec implements ElecFunction {
	
	private int chnnet;
	
	public Tv() {
		
	}
	
	public Tv(int chnnet) {
		this.chnnet = chnnet;
	}
	
	public Tv(String code, int cost, int chnnet) {
		super(code, cost);
		this.chnnet = chnnet;
	}

	@Override
	public void start() {
		System.out.println(getCode() + "제품" + super.getClass().getSimpleName() + "를" + chnnet + "으로 듣는다.");
		
	}

	@Override
	public void stop() {
		
		
	}

	@Override
	public void display() {
		
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Tv를 ");
		builder.append(chnnet);
		builder.append("을 본다");
		return builder.toString();
	}
	
	
	
	

}
