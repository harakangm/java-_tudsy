package test.ch08.인터페이스;

public class Audio implements RemoteControl{
 private int volume;
 
	@Override
	public void trunOn() {
		System.out.println("오디오를 켭니다.");	
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");	
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}
	
	//디폴트 메소드는 굳이 오버라이드를 안해줘도 에러가 안뜨지만
	//디폴트 메소드는 오버라이드 할때 반드시 접근제한자로 public을 붙여줘야함
	private int memoryVolume; //볼륨을 기억하는 필드
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("음소거 처리 합니다");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("음소거 해제");
			setVolume(this.memoryVolume);
		}
		
	}

	
}
