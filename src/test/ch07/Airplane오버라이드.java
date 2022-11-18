package test.ch07;
	// 클래스앞에 final이 붙으면 부모 클래스로 사용불가
	// 부모 클래스를 사용하면 안되거나 싫은 클래스는 final로 막을 수 있다
//public final class Airplane오버드라이브 {
public class Airplane오버라이드 {
	//메소드
	
	public void land() {
		System.out.println("착률");
	}
	
	// 메서드 앞에 final을 붙이면 오버라이드를 할 수 없음
//	public final void fly() {
	public void fly() {
		System.out.println("일반 비행");
		
	}
	public void takeOff() {
		System.out.println("이륙");		
	}
}
