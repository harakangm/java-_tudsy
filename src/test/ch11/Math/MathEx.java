package test.ch11.Math;

public class MathEx {

	public static void main(String[] args) {
		//올림과 반올림
		double v1 = Math.ceil(5.3);
		double v2 = Math.floor(5.3);
		
		System.out.println(v1 + "," + v2);
		
		//최대값과 최소값을 구해주는 함수
		long v3 = Math.max(3, 7);
		long v4 = Math.min(3, 7);
		
		System.out.println(v3 + "," + v4);
		
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1); // 반올림 해주는 메서드
		System.out.println(temp2);
		
		double v5 = temp2 / 100.0;// 소수점 이하 2자리 얻음
		System.out.println(v5); 

	}

}
