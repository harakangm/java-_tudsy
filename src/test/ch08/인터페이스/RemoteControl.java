package test.ch08.인터페이스;

public interface RemoteControl {
	// 인터페이스는 상수와 추상메소드만 올수 있다
	
	//인터페이스에서 상수는 static final을 안붙여도됨
	//인터페이스에 선언된 필드는 모두 상수이다
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	//public 추상메소드
	//구현하는 부분이 없음
	//public이 없어도 컴파일과정에서 자동으로 public abstract가 자동으로 붙음
	void trunOn();
	void turnOff();
	void setVolume(int Volume);
	
	//실행가능한 메소드도 추가 가능
	// 메서드 앞에 default를 붙임 : 인터페이스에서 실행 메소드를 구현하고 싶을때 사용
	// 디폴트 메소드도 자식클래스에서 재정의(오버드라이브)가능
	default void setMute(boolean mute) { // 음소거
		if (mute) {
			System.out.println("음소거 처리 합니다");
			// 자식클래스의 오버라이드된 메소드가 실행
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거 해제");
		}
	}
	
	//정적(static) 메소드
	//코드를 구현 할 수 있다.
	//public이 없어도 컴파일 과정에서 public이 붙는다
	static void changeBattery() {
		System.out.println("건전지 교체.");
	}

}
