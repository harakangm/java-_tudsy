package test.ch13_01.mainTreade;

import java.awt.Toolkit;

public class BeepPrintEx3 {
//메인이 돌아가면서 메인 스레스가 실행
	public static void main(String[] args) {
		// 동시처리하기 위해서 스레드를 하나 더만듬
		// 1. Thread 객체를 생성 그안에 익명객체 Runalbe(인터페이스)객체를 생성
		// 두개의 쓰레드(멀티쓰레드)가 생성되어서 메인과 같이 실행됨 
		Thread thread = new Thread() { // 상속 + 클래스
			// run() : 실제 스레드가 실행되는 코드
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("띵");

					try {
						Thread.sleep(500); // 0.5초 간 일시정지
						// 시스템아웃을 출력하고 0.5초간 쉰다
					} catch (Exception e) {

					}
				}

			}

		};
		
		thread.start();
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음을 내는 메서드

			try {
				Thread.sleep(500); // 0.5초
				// 비프음을내고 0.5초를 쉰다
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");

			try {
				Thread.sleep(500); // 0.5초 간 일시정지
				// 시스템아웃을 출력하고 0.5초간 쉰다
			} catch (Exception e) {

			}
		}

	}

}
