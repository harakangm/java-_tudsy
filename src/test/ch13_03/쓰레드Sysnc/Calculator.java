package test.ch13_03.쓰레드Sysnc;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	//메소드에 동기화 걸기
	//synchronized를 이용해서 걸어줌
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); //2초간 정지 일반예외
		} catch (InterruptedException e) {}
		
		//현재 작업중인 쓰레드의 이름 출력
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	//코드 블록에 동기화 걸기 (내가 동기화를 걸기 원하는 코드 범위 선택)
	public void setMemory2(int memory) {
		synchronized (this) {
			this.memory = memory;		
			try {
				Thread.sleep(2000); //2초간 정지 일반예외
			} catch (InterruptedException e) {}
			
			//현재 작업중인 쓰레드의 이름 출력
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
	}
	
}
