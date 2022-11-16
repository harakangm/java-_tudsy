package test.ch06;

public class MemberService {
	String name;
	String id;
	String password;
	int age;

	MemberService(String id, String password) {
		 this.id = id;
		 this.password = password;
	}
	
	boolean login (String id, String password) {		
		this.id = id;
		this.password = password;
		
			if (id == "hong" && password == "12345") {
				System.out.println("아이뒤와 페스워드를 입력하세요");
				return true;								
			}else {
			return false;}
		
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
