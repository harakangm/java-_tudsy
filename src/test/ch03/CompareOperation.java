package test.ch03;

public class CompareOperation {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		
		System.out.println("result1 : " + result1);
		
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		boolean result4 = (char1 < char2);
		System.out.println("result4 : " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result3 = (num3 == num4);
		System.out.println("result3 : " + result3);
		
		//실수 끼리 비교 할때 다른 데이터형이면 주의를 해야한다.
		//float와 double 정밀도를 표현하는게 다르기 때문에 결과가 같지가 않다
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result5 = (num5 == num6);
		boolean result6 = (num5 == (float)num6);
		System.out.println("result5 : " + result5);
		System.out.println("result6 : " + result6);
		
		//문자열은 비교하려면 equals를 써야함
		String str1 = "자바";
		String str2 = "java";
		
		boolean result7 = (str1.equals(str2));
		boolean result8 = (!str1.equals(str2));
		System.out.println("result7 : " + result7);
		System.out.println("result8 : " + result8);
		
		
	}

}
