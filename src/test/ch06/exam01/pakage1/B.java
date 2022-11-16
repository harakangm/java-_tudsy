package test.ch06.exam01.pakage1;

public class B {
	public void method () {
		A a = new A();
		
		a.filed1 = 1; //o
		a.filed2 = 1; // o default 같은 패키지라서 실행가능
		a.filed3 = 1; // x private 같은 클래스내에서만 실행가능
		a.method1();	//o
		a.method2(); 	//o
		a.method3();	//x private
	}
	
}


