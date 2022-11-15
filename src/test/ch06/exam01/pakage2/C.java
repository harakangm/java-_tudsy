package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
//	// A클래스가 (default) 접근제한자를 줘서 패키지가 달라서 사용 불가;
//	A a = new A();
//
//	
//	B b = new B();
	
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("안녕하세요"); //x
}
