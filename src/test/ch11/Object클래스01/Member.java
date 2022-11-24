package test.ch11.Object클래스01;

public class Member {

//	public static void main(String[] args) {
//		//오브젝트로 객체이기때문에 하나의 개체로 만들 수 있다
//		Object obj1 = new Object();
//		// 같은 주소를 가르킴
//		Object obj2 = obj1;
//		
//		//실제로 들어있는 값은 주소기 때문에 같음
//		System.out.println(obj1.equals(obj2)); //번지수를 비교
//		System.out.println(obj1 == obj2); //번지수를 비교
//		
//		String a = "1";
//		String b = "2";
//		//if (a == b) x 주소를 비교
//		//if (a.equals(b)) // o 실제 값을 비교
//		
//	}

	//논리적 동등 : 같은 객체든 다른 객체든 객체 저장 데이터가 동일하다.
	//equals()를 오버라이드해서 객체를 비교
	
 //필드생성
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}
	
	//논리적 동등 만들기 : 객체의 주소와 상관없이 필드의 값으로 비교
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) { // obj가 Member객체를 가지고 있냐? 강제형변환을 하기위해서 검사
			Member target = (Member)obj; // 강제 형변환 : 자식 객체에 있는 필드를 가져오기 위해
			//필드에 있는 아이디
			//여기서에 이퀄은 스트링의 이퀄 순수하게 문자값 비교
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
