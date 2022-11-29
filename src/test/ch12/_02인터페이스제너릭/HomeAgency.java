package test.ch12._02인터페이스제너릭;

// 실제로 사용할 곳에서는 사용할 타입을 지정해야한다.
public class HomeAgency implements _02Rentable<Home>{
//인터페이스에서의 사용
	@Override
	public Home rent() {
		// TODO Auto-generated method stub
		return new Home(); //Home객체를 리턴
	}

}
