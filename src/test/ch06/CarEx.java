package test.ch06;

public class CarEx {

	public static void main(String[] args) {

		/*
		 * 배열의 초기값 int, short, byte: 0 long: 0L char: '\u0000' float: 0.0f double: 0.0
		 * boolean: false
		 * 
		 * String: null (클래스는 초기값이 null)
		 */

		// 1. 객체를 생성하고 클래스에 필드 접근
		/* 이때 메모리가 생성 스텍영역에 mycar가 들어가고 
		   스택영역에 mycar에는 주소가 들어가 있음 실제
		   객체 데이터는 힙에 있다*/
		//객체가 생성이 될 때 생성자에 들어감
		Car myCar = new Car("그랜저", "검정", 250);
//=======================================================		
		// 2. 사용
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.star);
		System.out.println(myCar.speed);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.company);
		System.out.println("==========================");

		// 필드 외부에서 값 변경하지
		/*
		 * myCar.speed = 60; System.out.println("수정된 값:" + myCar.speed);
		 */
		
		// 생성자 오버로딩
		// 매개변수를 넣는 계수에 따라 자바에서 알아서 인식해서
		// 그거에 맞는 생성자를 실행 시켜줌(타입까지 확인함)
		Car Car2 = new Car("자가용");		
		System.out.println(Car2.model);
		System.out.println(Car2.color);
		System.out.println("==========================");
		Car Car3 = new Car("자가용", "빨강");
		System.out.println(Car3.model);
		System.out.println(Car3.color);
		System.out.println("==========================");
		
		
	}

}
