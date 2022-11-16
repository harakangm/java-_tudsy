package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;


public class C {
	public C() {
		A a = new A();
		
		a.filed1 = 1; //o
		a.filed2 = 1; // o
		a.filed3 = 1; // o
		a.method1();	//o
		a.method2(); 	//o
		a.method3();	//o
	}
}
