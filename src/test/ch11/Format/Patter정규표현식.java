package test.ch11.Format;

import java.util.regex.Pattern;

public class Patter정규표현식 {

	public static void main(String[] args) {
		/*
		 * 
		 * 02 - 222 -2222
		 * 010- 2222 - 2222
		 * */
		
		// \d{3,4}한개의 숫자인데 3~4자리가 들어옴 \d{4} 한자리 숫자 4개
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; // 패턴을 넣을 문자열, 전화번호 체크
		String data = "010-123-4567";
		
		//패턴의 매치스 함수를 이용해서 불린값을 리턴함
		//matches(패턴, 검증하고 싶은 데이터);
		boolean result = Pattern.matches(regExp, data);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // \이스케이프 문자를 쓰면 잘인식을 못함
		data = "test@naver.com";
		System.out.println(Pattern.matches(regExp, data));
		
	
	}

}
