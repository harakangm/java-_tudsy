package test.ch08.인터페이스다중상속;

public class SmartTelevision implements RemoteControl, Serchable{
	                          //인터페이스는 다중 상속이 가능하다
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");	
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}
	
	
}
