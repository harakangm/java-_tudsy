package test.ch11.날짜와관련된패키지;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 날짜시간조작하기2 {

	public static void main(String[] args) {

		// 데이터 포멧 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime StartDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0); // 현재 날짜 시간 // 2021 - 1 - 1 0:0:0
		System.out.println("시작일: " + StartDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0); // 현재 날짜 시간 // 2021 - 1 - 1 0:0:0
		System.out.println("종료: " + endDateTime.format(dtf));

		//isBefore() 이전 날짜인지 구하는 메서드
		if(StartDateTime.isBefore(endDateTime)) {
			System.out.println("진행 중입니다");
		} else if (StartDateTime.isEqual(endDateTime)) {//isEqual 같은 날짜인지 물어보는 메서드
			System.out.println("종료합니다");
		} else if (StartDateTime.isAfter(endDateTime)) {//isAfter 이후 날짜인지 묻는 데이터?
			System.out.println("종료했습니다.");			
		}
	}

}
