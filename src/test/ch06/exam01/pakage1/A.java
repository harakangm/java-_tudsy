package test.ch06.exam01.pakage1;

public class A {
	// 필드와 메서드에서 접근제한자는
	
	public int filed1;
	int filed2;
	private int filed3;
	
	public A () {
		this.filed1 = 1; //o
		this.filed2 = 1; // o
		this.filed3 = 1; // o
		method1();	//o
		method2(); 	//o
		method3();	//o
	}
	
	public void  method1() {}
	void  method2() {}
	private void  method3() {}
	
	
	
}
