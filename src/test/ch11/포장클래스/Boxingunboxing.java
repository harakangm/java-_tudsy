package test.ch11.포장클래스;

public class Boxingunboxing {

	public static void main(String[] args) {
		Integer obj = 100; // 정수형을 받기위한 클래스 박싱: 기본 타입의 값을 포장 객체로 만드는 것
		System.out.println(obj);
		int value = obj; //언박싱 :포장 객체를 기본타입으로 만드는것
		
		//언박싱 실행
		int value2 = obj +5; //obj는 5과 연산되기 전에 언박싱이 된다.
		
		//intValue() 는 인트형으로 되돌려주는 메서드이다
		System.out.println("value : " + obj.intValue());
		System.out.println("value2 : " + value2);

	}

}
