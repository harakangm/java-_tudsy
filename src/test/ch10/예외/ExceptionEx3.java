package test.ch10.예외;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"100" , "1oo"};
		
		for (int i = 0 ;  i <= a.length; i++) {
			//catch 여러개 받을 수 있다
			try {
				int value = Integer.parseInt(a[i]); //int형 데이터로 바꿔줌
				System.out.println("a["+ i + "]: + value");
			} catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			} catch(Exception e) { //Exception가 부모클래스라서 하위에 있는 클래스가 잡힘
									//다른 에러가 있고Exception으로 잡을려고 하면 하위로 와야함
				e.printStackTrace();			
			}
		}
	}

}
