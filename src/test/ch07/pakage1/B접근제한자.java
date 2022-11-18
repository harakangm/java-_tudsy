package test.ch07.pakage1;

public class B접근제한자 {
	public void method () {
		A접근제한자 a = new A접근제한자();
		
		a.field = "1"; // 별문제 없이 접근가능
		a.method(); // o
	}
}
