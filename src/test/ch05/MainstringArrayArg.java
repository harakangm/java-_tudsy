package test.ch05;

public class MainstringArrayArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("입력값 부족");
			System.exit(0); // 프로그램 강제 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(result);
		
//		java test.ch05.MainstringArrayArg 10 20
	}

}
