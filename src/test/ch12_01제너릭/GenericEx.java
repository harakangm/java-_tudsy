package test.ch12_01제너릭;

public class GenericEx {

	public static void main(String[] args) {
		//객체 생성
		//제너릭 <주고싶은 타입>
		Box<String> box1 = new Box<String>();
		box1.content = "박스1의 content는 현재 스트링이다";
		
		String str = box1.content;
		
		System.out.println(str);
		
		//제너릭안에는 기본형을 못씀
		Box<Integer> box2 = new Box<>();
//		box2.content = "dd"; //에러 현재 content는 인트형
		box2.content = 100;
		int val = box2.content;
		System.out.println(val);
	}

}
