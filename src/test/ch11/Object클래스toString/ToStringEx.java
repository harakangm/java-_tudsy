package test.ch11.Object클래스toString;

public class ToStringEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자" , "안드로이드");
		
		//toString():객체의 문자정보를 리턴한다.
		//@4e718207 -> 객체를 나타내는 16진수의 해시코드
		//오버라이드를 해서 사용을 할때는 특별하게 나타내고 싶은 문자 정보를 리턴
		String strObj = myPhone.toString();
		System.out.println(strObj);
		//toString()을 굳이 안써도 내가 보여주고 싶은 문자열을 보여줌
		System.out.println(myPhone);
		
		
		//err: 에러를 나타낼때 씀 or 그냥 다른방식으로 쓰고싶을떄
		try {
			int value = Integer.parseInt("1oo");
		}catch(NumberFormatException e) {
			System.err.println("에러입니다");
		}

	}

}
