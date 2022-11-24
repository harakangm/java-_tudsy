package test.ch11.포장클래스;

public class ValueCompareEx {

	public static void main(String[] args) {
		//얘내들은 127을넘음
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		//객체라서 주소가 달라서 false
		System.out.println(obj1 == obj2);
		//값을 비교
		System.out.println(obj1.equals(obj2));
		System.out.println();
		
		//예외[값을 비교하는 타입]
		//Boolean 예외 값을 비교
		//Character 예외 값을 비교
		//Byte, Short, Integer : 범위가 -128 ~ 127 까지는 값을비교
		Integer obj3 = 10;
		Integer obj4 = 10;

		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
	}

}
