package test.ch11.Object클래스toString;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company,String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return company + "," + os;
	}
	
	
}
