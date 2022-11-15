package test.ch06;

public class Korea {
	//final 필드
	//처음 저장된 값을 변경 할 수 없음 최종값
	//final 필드는 항상 초기값을 줘야함. (필드 선언시에 주거나 생성자에서 주거나)
	final String nation ="대한민국";
	final String ssn; // 주민번호
	
	//인스턴스 필드
	String name;
	
	//생성자
	// 초기값을 안주면 생성자에서라도 값을 줘야함
	Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
