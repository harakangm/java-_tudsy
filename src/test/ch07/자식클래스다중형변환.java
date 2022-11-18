package test.ch07;

class A {}

class B extends A {
	
}

class C extends A {
	
}

class D extends B {
	
}

class E extends C {
	
}

public class 자식클래스다중형변환 {
	
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//자동타입변환
		A a1 = b;
		A a2 = c;
		// 최상위 클래스를 상속받기 때문에 이런식으로도 자동타입변환이 가능
		A a3 = d;
		A a4 = e;
		
		//B 와 E는 상속관계가 아니기 때문에 자동타입 변환을 할 수가 없다. 
//		B b3 = e;
//		C c2 = d;
		
	}

}
