package test.ch06;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();

		myCal.powerOn();
		
		// 받아올 변수 입력
		int result1 = myCal.plus(5, 6);
		System.out.println(result1);
		//받는 결과값도 똑같은 형으로 받아야한다.
		// 매개변수 타입도 신경 써야함
		int x = 10, y = 4;
		double result2 = myCal.divide(x,y);
		System.out.println(result2);
		
		myCal.powerOff();
		

	}

}
