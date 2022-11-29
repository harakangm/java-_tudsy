package test.ch11.날짜와관련된패키지;

import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.*; (*) 유틸패키지안에 모든 클래스를 가져옴

public class 데이트클래스 {

	public static void main(String[] args) {
		Date now = new Date(); //현재 날짜와 시간 생성
		System.out.println(now);
		
		//데이트 객체안에 있는 메서드를 이용해서 문자열로 변경
		String strNow1 = now.toString(); //문자열 변경
		System.out.println(strNow1);
		
		//SimpleDateFormat 포맷팅을 위해 쓰는 클래스(객체)
		//생성자에서 받은 정보로 Date객체의 값을 원하는 모양으로 포멧팅해줌
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		System.out.println(sdf.format(now));
		
	}

}
