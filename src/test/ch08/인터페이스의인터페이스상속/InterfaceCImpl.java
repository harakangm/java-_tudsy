package test.ch08.인터페이스의인터페이스상속;

public class InterfaceCImpl implements InterfaceC{

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl methodB 실행");
		
	}

	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl methodA 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl methodC 실행");
		
	}

}
