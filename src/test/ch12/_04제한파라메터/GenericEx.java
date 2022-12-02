package test.ch12._04제한파라메터;

public class GenericEx {
	//매개변수로 타입 파라메터를 받음
	//리턴타입 앞에다 제너릭을 넣어주면됨
	//제한된 리턴타입을 쓰는 제너릭
	public static <T extends Number> boolean compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		boolean result1 = compare(10, 20);
		System.out.println(result1);

		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
	}

}
