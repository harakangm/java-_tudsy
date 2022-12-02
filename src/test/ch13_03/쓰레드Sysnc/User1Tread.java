package test.ch13_03.쓰레드Sysnc;

public class User1Tread extends Thread{
	private Calculator calculator;
	
	public User1Tread() {
		setName("User1Thread"); //쓰레드의 이름변경
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	//실제로 쓰레드가 실행될때 실행되는 코드
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
	
	
}
