package test.ch13_01.mainTreade;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//동시에 처리 되지 못함 
		//프로세스에서 메인스레드가하나만 생성이되서 소리먼저 5번 그다음 프린트가 출력됨
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음을 내는 메서드
			
			try {
				Thread.sleep(500); // 0.5초
				//비프음을내고 0.5초를 쉰다
			} catch (Exception e) {
				
			}
		}
		
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
