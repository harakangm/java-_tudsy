package test.ch10.사용자지정예외;
// 사용자가 예외처리를 만듬
public class InsuffException extends Exception {
	
	//생성자를 두개만듬
	public InsuffException() {
		
	}
	
	//메세지를 받아올 생성자
	public InsuffException(String message) {
		super(message);
	}
}
