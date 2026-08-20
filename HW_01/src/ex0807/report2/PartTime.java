package ex0807.report2;

public class PartTime extends Employee {
	
	private int timePay;
	
	
	
	public PartTime() {
		
	}
	
	public PartTime(int empNo, String eName, String job, int mgr,
			String hiredate, String deptName, int timePay) {
		
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay =timePay;
		
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("|");
		builder.append(timePay);
		builder.append("|");
		return builder.toString();
	}

	@Override
	public String getEmpMessage() {
		return geteName() + " 사원은 비정규직입니다.";
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	
	

}
