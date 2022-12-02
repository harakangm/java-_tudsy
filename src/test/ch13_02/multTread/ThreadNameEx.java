package test.ch13_02.multTread;

public class ThreadNameEx {

	public static void main(String[] args) {
		//main 쓰레드 이름 가져오기
		Thread mainThread = Thread.currentThread(); //현재 이코드를 실행하는 곳의  쓰레드이름을 가져온다
		System.out.println(mainThread.getName());
		
		//쓰레드 3개 생성
		//기본적으로 쓰레드에 이름을 안주면Thread-0실행
		//Thread-1실행
		//Thread-2실행
		for (int i = 0; i < 3; i++) {
			
			Thread threadA = new Thread() {

				@Override
				public void run() {
					System.out.println(getName() + "실행"); // 쓰레드 이름을 가져온다.
				}

			};
			
			threadA.start();
			
		}
		
		//chat쓰레드 생성(쓰레드에 이름주기)
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행"); // 쓰레드 이름을 가져온다.
			}

		};
		//start가 되기전에 쓰레드에 이름주기
		chatThread.setName("chat-thread"); // 쓰레드가 실행되기전에 이름을 바꾼다.
		chatThread.start();
		
	}

}
