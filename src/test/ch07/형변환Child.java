package test.ch07;

public class 형변환Child extends 형변환Parent{
	//필드 
	public int b = 1;
	
	@Override
	public void method2() {
		System.out.println("형변환Child - method2()");
	}
	
	public void method3() {
		System.out.print("형변환Child - method3()");
	}
	
}
