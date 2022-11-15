package test.ch06;

public class KoreaEx {

	public static void main(String[] args) {
		Korea k1 = new Korea("123456-12345678","팔팔이");
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		
		k1.name = "집사";
		System.out.println(k1.name);
		
		// 자바에서의 상수 불변의값(final), 공유해서 사용 가능 (static)
		//ex) 원주율: 3.14 ...... 지구의 무게...
		

	}

}
