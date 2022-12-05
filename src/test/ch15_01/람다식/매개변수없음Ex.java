package test.ch15_01.람다식;

public class 매개변수없음Ex {
	
	public static void main(String[] args) {
		test2(() -> System.out.println("매개변수따윈없다"));
		
		test2(new 매개변수없음() {

			@Override
			public void test() {
				System.out.println("매개변수따윈 없다 이건 익명객체임");
				
			}
			
		});
	}
	
	public static void test2(매개변수없음 no) {
		no.test();
	}
}
