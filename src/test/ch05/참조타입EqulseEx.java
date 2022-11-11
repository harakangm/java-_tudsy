package test.ch05;

public class 참조타입EqulseEx {

	public static void main(String[] args) {
		//String 리터럴이 같으면 같은 주소를 가르킨다(참조한다)
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		// 값으로 비교하는게 아니라 주소로 비교함 스택영역의 주소
		if (strVar1 == strVar2) {
			System.out.println("strVar1와 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1와 strVar2는 참조가 다름");
		}
		
		//리터럴 자체를 비교 값을 비교할땐 equals라는 함수를 사용
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1와 strVar2는 문자열이 같음");			
		}
		
		//new를 선언을하고 리터럴을 집어넣으면 같은 리터럴이라도 주소값이 다름
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar1와 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1와 strVar2는 참조가 다름");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar1와 strVar2는 문자열이 같음");			
		}
		
		
	}

}
