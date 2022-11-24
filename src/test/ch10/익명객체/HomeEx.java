package test.ch10.익명객체;

public class HomeEx {

	public static void main(String[] args) {
		//객체생성
		Home home = new Home();
		
		home.use1();
		home.use2();
		home.use3(new RemoteControl() {

			@Override
			public void turnOff() {
				System.out.println("보일러를 켭니다");
				
			}

			@Override
			public void turnOn() {
				System.out.println("보일러를 켭니다");
				
			}
			
		});
	}

}
