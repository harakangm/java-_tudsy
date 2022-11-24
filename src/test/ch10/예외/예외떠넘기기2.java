package test.ch10.예외;

public class 예외떠넘기기2 {

	public static void main(String[] args) throws ClassNotFoundException {
	

			findClass(); 

	}
	
	//throws 에러명
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.string2");
	}

}
