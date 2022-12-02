package test.ch12.와일드카드타입파라메터;

public class GenricEx {

	public static void main(String[] args) {
		//모든 사람이 신청
		Course.registerCourse1(new Applicant<Person>(new Person()));
		//학생만 신청
		Course.registerCourse2(new Applicant<student>(new student()));
		Course.registerCourse2(new Applicant<MiddleStudents>(new MiddleStudents()));
		Course.registerCourse2(new Applicant<HighStudents>(new HighStudents()));
		// 에러 Student 클래스와 그 하위 클래스만 이용가능
//		Course.registerCourse2(new Applicant<Person>(new Person()));
		
		//직장인 및 일반인 신청
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<worker>(new worker()));

	}

}
