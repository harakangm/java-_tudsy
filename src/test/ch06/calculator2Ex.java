package test.ch06;

public class calculator2Ex {

	public static void main(String[] args) {
		//인스턴스 생성
		//인스턴스를 생성하고 불러올수 있음
		//인스턴스를 실행해야지 메모리에 올려줌
//	calculator2 calculator = new calculator2();
//	
//	int plus = calculator.plus(1,3);
//	System.out.println(calculator.plus(5,6));
		
		//스태틱 멤버를 불러올때 앞에 클래스명.메소드
		// 정적멤버
		calculator2.plus(1,2);// 인스턴스를 생성하지 않아도 접근 가능
		calculator2.minus(1,2);// 인스턴스를 생성하지 않아도 접근 가능
		System.out.println(calculator2.pi);
		
		System.out.println(calculator2.info);
	
	}

}
