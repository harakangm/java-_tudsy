package test.ch13_01.mainTreade;

import java.awt.Toolkit;

public class BeepPrintEx4  extends Thread{
	// 쓰레드 객체를 상속받아서 사용
	//run(): 실제 쓰레드가 실행되는 코드
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음을 내는 메서드
			
			try {
				Thread.sleep(500); // 0.5초
				//비프음을내고 0.5초를 쉰다
			} catch (Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		Thread th = new BeepPrintEx4();
		//start() : 오버라이드된 run() 메서드를 실행
		th.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500); // 0.5초 간 일시정지
				//비프음을내고 0.5초를 쉰다
			} catch (Exception e) {
				
			}
		}

	}


}
