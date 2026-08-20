package ex0806.enumex;

/**
 * enum은 열거형으로 안에 정의된 정보는 static final = 상수 이다.
 */

/*public enum Grade {
	BASIC, SILVER, GOLD; 
}*/
////////////////////////////////////////////

public enum Grade {
	BASIC("일반", 100, 5), 
	SILVER("우수", 200, 5 ), 
	GOLD("최우수", 300, 30); 
	
	private final String kind;
	private final int point;
	private final int role;
	
	//enum타입안에 있는 생성자는 무조건 private 이다.
	Grade(String kind, int point, int role){
		this.kind = kind;
		this.point = point;
		this.role = role;
	}

	public String getKind() {
		return kind;
	}

	public int getPoint() {
		return point;
	}

	public int getRole() {
		return role;
	}
	
	
	
}






