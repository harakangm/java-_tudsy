package test.ch07.다형성에서instenceof;

public class InstensofEx {
	public static void personInfo(Person person /* =new Person("홍길동")*/) {
		System.out.println("name: " + person.name);
		person.walk();
		if (person instanceof Student) { // person이 Student 타입을 참조하나..
			Student student = (Student)person;
			student.study();
			System.out.println(student.studentNO);
		}
	}
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		
		Person p2 = new Student("김길동", 10);
		// 실행되는 순간 자동형변환이랑 같음
		personInfo(p2);
		
	
	}

}
