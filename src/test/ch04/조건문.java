package test.ch04;

public class 조건문 {

	public static void main(String[] args) {
		int score = 75;

		// if안에 있느 식이 true if 토큰안에 있는 것이 실행
		// else if문이 false면 실행
//		if (score >= 90) {
//			System.out.println("90점 이상입니다.");
//		}else {
//			System.out.println("90점 이상이 아닙니다.");			
//		}

		// if else if 문은 else 생략 가능
		if (score >= 90) {
			System.out.println("90점 이상입니다.");
		} else if (score >= 80) {
			System.out.println("80점 이상입니다.");
		} else if (score >= 70) {
			System.out.println("70점 이상입니다.");
		}

		// 랜덤함수
		// 리턴해주는 값이 double형이기 때문에 케스트 해줘야함
		// 주사위 만들기
		// Math.함수를 이용
		int num = (int) (Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1");
		} else if (num == 2) {
			System.out.println("2");
		} else if (num == 3) {
			System.out.println("3");
		} else if (num == 4) {
			System.out.println("4");
		} else if (num == 5) {
			System.out.println("5");
		} else if (num == 6) {
			System.out.println("6");
		}

		//스위치문
		//스위치문안에 byte, char, short, int, long
		//그리고 String 까지 쓸 수 있다
		char grade = 'B';
		
		switch (grade) {
		case 'A':
			System.out.println("1번");
			break;
		case 'B':
			System.out.println("2번");
			break;
		case 'C':
			System.out.println("3번");
			break;
		case 'D':
			System.out.println("4번");
			break;
		case 'E':
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");

		}

	}

}
