package test.ch12.와일드카드타입파라메터;

//과목지원 클래스
public class Applicant<T> {
	public T kind;
	
	//생성자 매개변수를 모르니 파라메터로 받음
	public Applicant(T kind) {
		this.kind = kind;
	}
}
