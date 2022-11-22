package test.ch08.인터페이스다중상속;

public class MultiInterfaceEx {

	public static void main(String[] args) {
		//두개를 상속받아서 객체를 두개 만들어야함
		RemoteControl rc = new SmartTelevision(); // 자동 형변환
		
		rc.turnOn();
		rc.turnOff();
		
		//부모객체로 부터 오버드라이브한 함수를 호출함
		Serchable searchable = new SmartTelevision();
		searchable.search("www.naver.com");
		//인터페이스의 특징 인터페이스가 인터페이스를 상속 받을 수 있음
	}

}
