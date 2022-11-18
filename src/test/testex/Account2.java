package test.testex;

public class Account2 {
	private String accNumber;
	private String owner;
	private int balance;
	
	//생성자
	
	public Account2(String ano, String owenr, int balance) {
		this.accNumber = ano;
		this.owner = owenr;
		this.balance = balance;
	}
	
	//메소드
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
