package test.ch12._03제너릭메소드;

public class GenericEx {
	//제네릭 메소드
	//      타입파라메터를 붙이는 위치
	// 접근제한자 뒤 T는 매개변수의 T
	// 박스뒤에 T는 클래스의 T
	public static <T> Box<T> boxing(T t) {
		//객체를 생성
		Box<T> box = new Box<T>();
		//매개변수로 받는 t를 세팅해줌
		box.set(t);
		return box;
	}
	
	
	public static void main(String[] args) {
		//제너릭 메소드 호출 : T를 Integer로 대체
		Box<Integer> box1 = GenericEx.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		//스트링타입
		Box<String> box2 = boxing("강하라");
		String strValue = box2.get();
		System.out.println(strValue);
		
		
		}

}
