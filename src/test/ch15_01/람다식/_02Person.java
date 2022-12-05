package test.ch15_01.람다식;

public class _02Person {
	
	public void action(_02Calcuable2 calcuable2) {
		double result = calcuable2.calc(10, 4);
		System.out.println("결과 " + result);
	}
	
}
