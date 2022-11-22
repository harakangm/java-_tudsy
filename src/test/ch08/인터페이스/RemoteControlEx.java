package test.ch08.인터페이스;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.trunOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("========================");
		
		rc = new Audio();
		rc.trunOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
//		//객체를 생성할떄 바로 자동형변환을 해주면됨
//		RemoteControl rc;
//		
//		rc = new Television();		
//		rc.trunOn();
//		rc.setVolume(10);
//		rc.turnOff();
//		
//		rc = new Audio(); //오디오로 교체
//		rc.trunOn();
//		rc.setVolume(5);
//		rc.turnOff();
//		
//		// static의 특성을 가졌지 때문에 객체를 생성을 하지 않고 호출가능
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);

	}

}
