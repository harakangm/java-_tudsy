package test.ch08.인터페이스의인터페이스상속;

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceC impl = new InterfaceCImpl();
		// InterfaceA에 추상메소드는 methodA밖에 없음
		InterfaceA ia = impl; // 자동 형변환	
		ia.methodA();
		
		InterfaceB ib = impl; // 자동 형변환
		ib.methodB();
		
		//InterfaceC는 상속을 받아서 부모의 (A,B)의 추상 메소드도 가져다 쓸 수 있음
		InterfaceC ic = impl; // 자동 형변환
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
