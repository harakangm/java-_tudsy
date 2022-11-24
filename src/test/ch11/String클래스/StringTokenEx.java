package test.ch11.String클래스;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		//문자열을 끊어서 따로 사용하고 싶을때
		//문자열을 구분하는 것 구분자
		
		String data1 = "홍길동&이수홍,박연수";
		//String에 있는 메서드
		//리턴을 배열로 줌
		String[] arr= data1.split("&|,");

		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println(arr.toString());
		
		//StringTokenizer 유틸에 있어서 임포트해야함
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		
		//countTokens() 현재 토큰의 갯수를 찍어줌
		System.out.println(st.countTokens());
		//hasMoreElements() 토큰이 있는지 물어보는 메서드 있으면 true 없으면 false
		//nextToken() 다음 토큰을 가져오는 메서드
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}


	
}
