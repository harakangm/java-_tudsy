package test.ch09.클래스중첩;

public class AEx {

	public static void main(String[] args) {
//		//외부에서 B클래스를 사용
//		//인스턴스 멤버 클래스는 객체를 먼저 생성후에 사용
//		A a = new A();
//		
//		a.useB();
//		
//		//중첩 클래스를 사용하는법
//		//타입.타입 객체명 = 객체.new 타입();
//		A.B b = a.new B();
		
		//장점 중첩클래스를 사용하면 접근하기편함
		// 	  외부에서 볼때 불필요한 관계 클래스를 감출 수 있음
		A a = new A();
		a.useB();
	}

}
