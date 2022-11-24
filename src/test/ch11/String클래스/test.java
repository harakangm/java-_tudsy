package test.ch11.String클래스;

import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) {
		String key = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(key, ",");
		
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
