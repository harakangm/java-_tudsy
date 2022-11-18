package test.ch07;

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculater calc = new Calculater();
		
		System.out.println(calc.areaCircle(r));
		
		Computer com = new Computer();
		// 오버라이드 된 메소드가 있으면 오버라이드 된 메소드 실행
		System.out.println(com.areaCircle(r));

	}

}
