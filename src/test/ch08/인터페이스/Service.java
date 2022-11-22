package test.ch08.인터페이스;

public interface Service {
	// 디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속코드 ");
	}

	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속코드");
	}
	
//	//private 메소드
//	private void defaultCommon() {
//		System.out.println("defaultMethod1 중복 코드");		
//		System.out.println("defaultMethod2 중복 코드");		
//	}

	// 정적 메소드
	static void staitcMethod1() {
		System.out.println("staitcMethod1 종속코드");
	}

	static void staitcMethod2() {
		System.out.println("staitcMethod2 종속코드");
	}

}
