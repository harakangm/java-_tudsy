package test.ch15_01.람다식;

public class _02lamdaEx2 {
	
	public static void main(String[] args) {
		//리턴 값이 있는 람다식
		//익명구현 객체랑 비슷함
		//리턴문이 하나만 있을때 중괄호와 리턴을 생략가능
		_02Person calc = new _02Person();
		
		calc.action((x,y) -> {
			System.out.println("이건 람다고");
			double result = x + y;
			return result;
		});
		
		//return문이 하나만 있어서 생략가능
		//데이터는 하나이지만 데이터를 처리 하는 방법이 여러가지
		calc.action((x,y) -> x - y * 5);
		calc.action((x,y) -> x * y);
		
		calc.action(new _02Calcuable2() {

			@Override
			public double calc(double x, double y) {
				System.out.println("어쨋든 익명객체아닌겨?");
				double result = x + y + y;
				return result;
			}
			
		});
	}
}
