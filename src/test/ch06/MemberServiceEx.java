package test.ch06;

public class MemberServiceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login(" "," ");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
		
		
		

	}

}
