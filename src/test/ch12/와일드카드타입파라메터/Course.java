package test.ch12.와일드카드타입파라메터;

public class Course {
	//모든 사람이 수강신청 가능
	//클래스에 제너릭을 붙이면 항상 붙여야함
	// ? 와일드 카드 : 어떠한 타입이든지 가능함
	public static void registerCourse1(Applicant<?> applicant)
	{	//해당클래스의 이름을 가져온다.
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course1을 등록");
	}
	
	//학생만 수강신청 가능
	//와일드카드 학생Class와 그 아래 하위 클래스만 사용가능 
	public static void registerCourse2(Applicant<? extends student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course2을 등록");
	}
	
	//직장인 및 일반인만 수강신청 가능
	//자기 자신과 부모클래스만 제네릭 타입으로 사용가능(파라메터)
	public static void registerCourse3(Applicant<? super worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course3을 등록");
	}
	
}
