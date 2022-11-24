package test.ch11.String클래스;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String data = "자바";
		
		// 만약 인코딩해야하는곳이  UTF - 8가 아니라 다른 것일때 사용
		
		//getBytes() 인코딩 하는 메서드
		//byte[] 배열값으로 값을 리턴받음
	byte[] arr1	= data.getBytes(); //utf-8 로 인코딩
	
	//배열을 문자열로 바꾼다.
	System.out.println(Arrays.toString(arr1));

	//다시 디코딩 utf-8로 디코딩
	String str1 = new String(arr1);
	System.out.println(str1); //배열을 문자열로 바꾼다.

	}

}
