package test.ch05;

import java.util.Calendar;

public class 열거타입예제 {

	public static void main(String[] args) {
		//enum에서 선언한것
		열거타입Week today = null;
		//자바에서 제공하는 라이브러리:라이브러리는 임포트 해야지 사용
		Calendar cal = Calendar.getInstance();
		
		// 요일을 숫자로 얻는다.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//숫자를 열거 상수로 변환해서 변수에 대입.
		switch(week) {
		case 1: today = 열거타입Week.SUNDAY; break;
		case 2: today = 열거타입Week.MONDAY; break;
		case 3: today = 열거타입Week.THURSDAY; break;
		case 4: today = 열거타입Week.WEDNESDAY; break;
		case 5: today = 열거타입Week.THURSDAY; break;
		case 6: today = 열거타입Week.FRIDAY; break;
		case 7: today = 열거타입Week.THURSDAY; break;
		}
		
		if(today ==	열거타입Week.SUNDAY) {
			System.out.println("일요일 입니다.");
		}else {
			System.out.println("일요일이 아닙니다.");	
		}
		
	}

}
