package test.ch07;
//자식 클래스
public class Smartphone extends phone{
	//필드
	public boolean wifi;
	
	//생성자
	public Smartphone(String model, String color) {
//		super(model, color); ////생성자 호출
		super(); // 항상 부모생성자가 먼저 호출되야함
		System.out.println("자식생성자호출");
//		//부모에서 상속 받은 필드를 가져옴
//		//상속을 하면 부모클래스에 있는 것을 마을대로 가져올수 있음
		this.model = model; // 부모필드에 초기값을 줄 수 있다.
		this.color = color;
	}
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi =  wifi;
		System.out.println("와이파이 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니");	
	}
	
}
