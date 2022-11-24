package test.ch11.Object클래스01;

public class EqualsEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//객체를 따로 생성해서 주소가 다름
		//현재는 오버라이드를 해서 객체가 저장하고 있는 필드 값을 비교
		//논리적 동등
		System.out.println(obj1.equals(obj2));
		
		if (obj1.equals(obj3)) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
			
		}
	}

}
