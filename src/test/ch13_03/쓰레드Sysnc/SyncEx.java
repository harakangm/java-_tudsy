package test.ch13_03.쓰레드Sysnc;

public class SyncEx {

	public static void main(String[] args) {
		Calculator calulator = new Calculator();
		
		User1Tread user1 = new User1Tread();
		//user1 객체의 필드에 객체를 생성해줌
		user1.setCalculator(calulator);
		//쓰레드 실행
		user1.start();
		
		User2Tread user2 = new User2Tread();
		//user1 객체의 필드에 객체를 생성해줌
		user2.setCalculator(calulator);
		//쓰레드 실행
		user2.start();

	}

}
