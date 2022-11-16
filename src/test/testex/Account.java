package test.testex;

public class Account {
	private int balance;
	
	public void setBalance(int balance) {
		if (balance >= 0 && balance <= 1000000) {
			this.balance = balance;
		}else {
			System.out.println("0~100만원 단위를 입력하세요");
		}
	}
	
	public int getBalance() {
		return this.balance;
	}
}
