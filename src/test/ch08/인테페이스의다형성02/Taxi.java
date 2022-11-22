package test.ch08.인테페이스의다형성02;

public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
		
	}
	
	public void checkFare() {
		System.out.println("승차요금 체크.");		
	}
	
}
