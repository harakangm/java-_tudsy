package test.ch01_2;

public class Pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//강제 형변환	큰값을 작은 저장범위에 우겨넣을때 down
		int intValue =500;
		byte byteValue = (byte) intValue;
		//강제형변환을 하면 값이 손실된다		
		System.out.println(byteValue);
		
		long var1 = 220000000000L;
		int var4 = (int)var1;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6);
		
		//int는 정수만 찍혀서 뒤에 소수점은 짤림
		double var7 = 3.41;
		int var8 = (int)var7;
		System.out.println(var8);
		
		// 연산식에서 강제형변환
		//자바 컴파일러는 컴파일 단계에서 미리 연산을함 
		byte x = 10;
		byte y = 20;
		//더 해지는 과정에서 int가 됨 x값도 인트 y값도 인트
		int result = x + y;
		// byte result = (byte)(x+y);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		System.out.println(result3);
		
		char v6 = 'A';
		char v7 = 1;
		char result4 = (char)(v6 + v7);//int로 찍으면 57
		System.out.println(result4);
		
		int v8 = 10;
		int result5 = v8 / 4 ; //정수연산의 결과는 함상 정수이다
		System.out.println(result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0; // 4라는 정수로 나누면
		System.out.println(result6);// 2.0이 결과값으로 출력
		
		int v10 = 1;
		int v11 = 2;
		double  result7 = v10 / v11 ;
		System.out.println(result7);
//==================================================
		String str = "안녕";
		int val = 1;
		String val2 = "10";
		
		System.out.println(str + val + val2);
		System.out.println(2 + val + val2);
		
		byte value = Byte.parseByte(val2); //문자형을 -> byte형으로
		int value2 = Integer.parseInt(val2); // 문자형을 -> int형으로
		double value3 = Double.parseDouble(val2);
//=========================================================
		String str2 = String.valueOf(true); // 기본형을 -> sring형으로
		System.out.println(str2);
	
	}

}
