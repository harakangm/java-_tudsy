package test.ch11.Format;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		
		df = new DecimalFormat("#,###"); //포맷을 정한다.
		System.out.println(df.format(num)); //포맷을 적용.
		
		//앞에는 정수 10진수를 출력하겠다
		df = new DecimalFormat("#,###.0"); //포맷을 정한다.
		System.out.println(df.format(num)); //포맷을 적용.
		
		double a = num*10;
		double b = Math.round(a);
		
		System.out.println(b / 10.0);
	}

}
