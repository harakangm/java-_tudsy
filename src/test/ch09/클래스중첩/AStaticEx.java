package test.ch09.클래스중첩;

public class AStaticEx {

	public static void main(String[] args) {
		//이런식으로 접근가능
		// AStatic객체를 생성하지 않고 바로 객체 생성가능
		AStatic.B b = new AStatic.B();
		
		System.out.println((b.filed1));
		b.method1();

	}

}
