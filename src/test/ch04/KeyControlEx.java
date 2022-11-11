package test.ch04;

import java.util.Scanner;

public class KeyControlEx {

	public static void main(String[] args) {
		// 1,2를 입력했을 떄 속도를 증가, 3입력시 종료시키는 프로그램

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("-------------------");
			System.out.println("1. 증속, 2.감소, 3.중지");
			System.out.println("---------------------");
			System.out.println("선택: ");

			String strNum = scanner.nextLine();

			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재속도: " + speed);
			} else if (strNum.equals("3")) {
//				run = false;
//				System.out.println("프로그램 종료");
				//break를 만나면서 반복문 종료 그아래의 코드 실행불가
				break;
				//반복문으로 다시 올라감
//				continue;
			}
			System.out.println("haha");
		}

		
	}

}
