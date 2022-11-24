package test.ch10.예외;

public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"100" , "1oo", null , "200"};
		
		for (int i = 0 ;  i <= a.length; i++) {
			//catch 여러개 받을 수 있다
			try {
				int value = Integer.parseInt(a[i]); //int형 데이터로 바꿔줌
				System.out.println("a["+ i + "]:" + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			} catch(NullPointerException | NumberFormatException e) { // 두가지 이상의 예외를 동일하게 처리 할 수 있다									
				System.out.println("데이터에 문제가 있음 :" + e.getMessage());			
			}
		}
	}

}
