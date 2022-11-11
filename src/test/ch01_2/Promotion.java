package test.ch01_2;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동 형변환 upcasting			
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		//char는 유니코드로 저장되고 int가 범위가 더큼		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		//범위가 롱이 더크기 떄문에		
		intValue = 50;
		long longValue = intValue;	
		System.out.println(longValue);
		//허용범위가 float가 훨씬큼		
		longValue = 100;
		float flaotValue = longValue;
		System.out.println(flaotValue);
		
		flaotValue = 100.5f;
		double doubleValue = flaotValue;
		System.out.println(doubleValue);
		
		//예외 char타입의 허용범위는 음수를 포함하지 않음 byte는 음수가 있어서 안됨		
//		byte test = 65;
//		char charValue = test;

		
		//short와 char사이도 자동형변환이 안됨		
		//short도 음수를 포함하고 있음		
//		short a = 0;
//		char b = a;
		

		
		
	}

}
