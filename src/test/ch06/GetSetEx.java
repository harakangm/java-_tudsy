package test.ch06;

public class GetSetEx {

	public static void main(String[] args) {
		GetSet getset = new GetSet();
		
		//set 함수 사용
		getset.setSpeed(10);
		//get 함수 사용
		System.out.println(getset.getSpeed());
		
		if(!getset.isStop()) {// 달리고 있을때
			getset.setStop(true); // 멈춤
		}
		System.out.println(getset.getSpeed());
	}

}
