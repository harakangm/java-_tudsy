package test.ch02;

// 객체를 불러오기 위해서 임포트를 해야함
import java.util.Scanner;

public class ScannerExsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체의 클레스 이름을 먼저
		// 그다음 객체에 받아올 변수 선언
		// 괄호안에 값을 하나 넣어야함
		// Scanner 객체
		Scanner scanner = new Scanner(System.in);
		System.out.println("x값 입력: ");
		String strX = scanner.nextLine(); // enter키를 누르면 문자열을 읽는다.
		int x = Integer.parseInt(strX);

		System.out.println("y값 입력: ");
		String strY = scanner.nextLine(); // enter키를 누르면 문자열을 읽는다.
		int y = Integer.parseInt(strY);

		int result = x + y;

		System.out.println("result : " + result);
		System.out.println();
		// ctrl shift f 코드정렬
		while (true) {
			System.out.println("입력 문자열 : ");
			String data = scanner.nextLine();
			
			// 자바에서는 스트링은 객체이기 떄문에 이퀄을 이용해서 스트링값을 잡아야함
			if (data.equals("q")) { // 입력받은 데이터가 q인가?
				break;
			}

			System.out.println("출력 문자열 : " + data);
			System.out.println();
		}

		System.out.println("종료");
	}

}
