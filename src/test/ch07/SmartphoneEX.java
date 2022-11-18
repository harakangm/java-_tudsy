package test.ch07;

public class SmartphoneEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone myphone = new Smartphone("V50s","black");
		
		//phone에서 상속 받은 필드 일기 : 자식 객체에서도 부모 필드에 접근 가능
		System.out.println(myphone.model +" , " + myphone.color);
		
		//phone에서 상속받은 메소드:자식 객체에서 부모메소드에 접근가능
		myphone.bell();
		myphone.sendVoice("안녕");
		myphone.receiveVoicde("넴");
		myphone.hangUp();
		
		myphone.setWifi(true);
		System.out.println(myphone.wifi);
	}

}
