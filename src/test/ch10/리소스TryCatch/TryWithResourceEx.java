package test.ch10.리소스TryCatch;

public class TryWithResourceEx {

	public static void main(String[] args) {
		
		//try안에 열고 싶은 리소스 객체 생성
		try(MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data); //int형 변환
			System.out.println("확인");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//AutoCloseable 인터페이스 떄문에 자동으로 닫아줌
		System.out.println("====================");
		try(MyResource res = new MyResource("A")) {
			String data = res.read2(); // NumberFormatException 에러 발생
			System.out.println("확인");
			int value = Integer.parseInt(data); //int형 변환
			System.out.println("확인");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
