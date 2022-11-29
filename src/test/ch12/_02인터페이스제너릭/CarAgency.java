package test.ch12._02인터페이스제너릭;

//실제로 사용할 곳에서는 사용할 타입을 지정해야한다.
public class CarAgency implements _02Rentable<Car>{
//인터페이스에서의 사용
	@Override
	public Car rent() {
		// TODO Auto-generated method stub
		return new Car(); //Car객체를 리턴
	}

}
