package test.ch08.인터페이스의다형성필드;

public class HankukTire implements Tire{

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
		
	}

}