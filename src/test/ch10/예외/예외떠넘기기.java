package test.ch10.예외;

public class 예외떠넘기기 {
	//main메소드는 JVM에서 실행한다
	//main메소드에 throws를 사용해서 예외를 떠넘기면 JVM은 예외 내용을 콘솔에 출력한다.
	public static void main(String[] args)  {
	

		try {
			findClass();
		} catch (Exception e) {

			e.printStackTrace();
		} //메소드를 호출한 곳에서 예외처리

}
	//throws 에러명
	public static void findClass() throws Exception {
		Class.forName("java.lang.string2");
	}

}
