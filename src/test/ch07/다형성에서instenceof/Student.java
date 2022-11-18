package test.ch07.다형성에서instenceof;

public class Student extends Person{
	//필드
	public int studentNO;
	//생성자
	public Student(String name, int sudentNo) {
		super(name); // 부모 생성자 호출
		this.studentNO = sudentNo;
	}
	
	//메소드

	public void study() {
		System.out.println("공부를 합니다");
	}
}

