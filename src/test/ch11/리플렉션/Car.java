package test.ch11.리플렉션;

public class Car {

	public static void main(String[] args) {
//		//객체의 클래스 이름이 클래스임
//		//클래스의 정보들이 clazz 변수에 들어감
//		Class clazz = Car.class; //클래스 객체를 얻는 1번째 방법
		
//		Class clazz = Class.forName("test.ch11.리플렉션.Car"); //일반예외 클래스 객체를 얻는 2번째 방법
		
// 3번째 방법 객체를 먼저 생성 하고 getClass 메서드를 이용		
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println("패키지 이름:" + clazz.getPackage().getName());
		System.out.println("클래스의 간단한 이름 :" + clazz.getSimpleName());
		System.out.println("클래스의 전체 이름 :" + clazz.getName());
	
	}

}
