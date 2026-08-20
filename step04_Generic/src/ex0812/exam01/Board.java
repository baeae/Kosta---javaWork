package ex0812.exam01;

/*
public class Board {
	
	private int bno;

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}
	
	
	

}*/

public class Board<T> {
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	

}
