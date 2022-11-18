package test.testex;

public class Account {
	private int balance;
	public static final int MIN_BALACE = 0;
	public static final int MAX_BALACE = 1000000;
	
	public void setBalance(int balance) {
		if (balance >= MIN_BALACE && balance <= MAX_BALACE) {
			this.balance = balance;
		}else {
			System.out.println("0~100만원 단위를 입력하세요");
		}
	}
	
	public int getBalance() {
		return this.balance;
	}
}
