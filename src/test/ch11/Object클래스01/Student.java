package test.ch11.Object클래스01;

public class Student {
	//필드
	private int no;
	private String name;
	
	//생성자
	public Student(int no, String name) {
		this.no = no; //필드에 초기값 할당
		this.name = name;
	}

	
	//메소드
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

 //Object 객체에서 오버라이드
	//스트링형은 값이 같으면같은 주소값  할당
	@Override
	public int hashCode() {
		System.out.println("no:" + no + "name:" +name.hashCode());
		int hashCode = no + name.hashCode(); //번호하고 이름이 같으면 hashcode변수에는 동일한 값이 생성이 된다.
		return hashCode;
	}


	@Override
	public boolean equals(Object obj) {
		// obj가 student객체를 가지고 있냐?
		if (obj instanceof Student) {
			//강제타입변환
			Student target = (Student)obj;
			
			//no하고 name이 같은지 비교
			//함수안에서 equals는 스트링객체의 equals
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
				
			
		}
		return false;
	}
	
	

}
