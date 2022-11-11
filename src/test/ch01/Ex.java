package test.ch01;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수
		//롱은 뒤에다 숫자 L을 붙여야함
		long var5 = 1000000000000L;
		//케릭터타입은 문자 하나만 쓸 수있음		
		char c1 = 'A';
		char c2 = 1111;
		//플루트 뒤에는 f를 붙여야함
		//소수점아래의 정밀도를 높이고 싶을때 float
		float var6 = 0.123456789f;
		double var7 = 0.123456789;
		double var8 = 3e6; // 3.0 * 10의 6승
		double var9 = 2e-3; // 2.0 * 10의 마이너스 3승
		float var10 = 2e-3f;
		
		boolean stop = true;
		
		int x = 10;
		
		boolean result1 = (x == 20);
		
		System.out.println(result1);
		System.out.println(stop);
		
		if (stop) {
			System.out.println("정지합니다");
		}
		
		String name = "강하라";
		
//		System.out.println(var1 + ":"+ var2 + ":"
//				+ var3 + ":" + var4);
//		
//		System.out.println(var5);
		
//		System.out.println(var6);
//		System.out.println(var7);
//		System.out.println(var8);
//		System.out.println(var9);
//		System.out.println(var10);
//		
	}

}
