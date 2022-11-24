package test.ch10.예외;

public class 일반예외 {

	public static void main(String[] args){
		//일반 예외는 반드시 try catch를 써야함
		
			//주어진 클래스를 찾는
		try {
			Class.forName("java.lang.String2"); //주어진 클래스를 찾는 코드
			System.out.println("java.lang.String 클래스가 존재합니다");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
