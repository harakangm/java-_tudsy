package test.ch03;

public class 비트로직연산자 {

	public static void main(String[] args) {
		//비트논리연산자
		//2진수로 변환후에 계산을 한다
		// 1 = T 0 = F
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 |25));
		//두 비트 중 하나는 1 이고 다른 하나가 0일 경우 연산 결과는 1
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		//배타적 비트연산자에서 보수로 가서 결과 값을 산출함
		System.out.println("~54 = " + (~45));
		System.out.println("---------------------------");
		
		//참고 c언어 에서 받아온 값을 Java의 값으로 바꾸는법
		byte recieveData = -128;
		int unsignedInt = Byte.toUnsignedInt(recieveData);
		System.out.println(unsignedInt);

	}

}
