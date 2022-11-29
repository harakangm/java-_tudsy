package test.ch11.날짜와관련된패키지;

import java.util.Calendar;
import java.util.TimeZone;

public class 유틸패키지캘린더클래스2 {

	public static void main(String[] args) {
		//타임존 객체 생성
		TimeZone timeZone = TimeZone.getTimeZone("Amerca/Los_Angeles");
		
		//getInstance() 컴퓨터에 현재 시간과 날짜를 가져오는 
		//Calendar클래스의 정적메서드
		//타임존이나 로컬이 필요할때는 new Calendar(타임존, 로컬)
		//생성자로 생성을함
		System.out.println(Calendar.getInstance());
		Calendar now = Calendar.getInstance(timeZone);
		//get(int) 객체의 필드값(현재의) 데이터를 불러옴
		System.out.println();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; //일
		int day = now.get(Calendar.DAY_OF_MONTH); //월
		int week = now.get(Calendar.DAY_OF_WEEK); //요일 일요일:1 ~ 토요일:7
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String strWeek = null;
		
		//숫자로받아온 요일 바꾸기
		switch(week) {
		case Calendar.MONTH : strWeek = "월";	 break;
		case Calendar.TUESDAY : strWeek = "화";	 break;
		case Calendar.WEDNESDAY : strWeek = "수";	 break;
		case Calendar.THURSDAY : strWeek = "목";	 break;
		case Calendar.FRIDAY : strWeek = "금";	 break;
		case Calendar.SATURDAY : strWeek = "토";	 break;
		case Calendar.SUNDAY : strWeek = "일";	 break;
		}

		System.out.println(strWeek);
		//=======================================
		int amPm = now.get(Calendar.AM_PM); // 현재가 am,pm인지 구분해준다 (0:am , 1:pm)
		System.out.println(amPm);
		
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		
		System.out.println(now.get(Calendar.HOUR)+ "," + now.get(Calendar.MINUTE)+ "," + now.get(Calendar.SECOND));
		
		//HOUR : 오전/오후 기준(0~11)까지
	}

}
