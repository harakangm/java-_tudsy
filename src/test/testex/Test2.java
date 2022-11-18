package test.testex;

public class Test2 {

//	static boolean isNumber (String str) {	
//		
//		String x = str.replaceAll("[^0-9]", "");
//							// 문자열의 비교
//		if (!(str == null && str.equals(""))) {
//			if(str.equals(x)) {
//				return true;
//			}
//		}
//		
//		return false;
////		final String REGEX = "\\d+";
////		str.matches(REGEX);
////		System.out.println(str.matches(REGEX));
////		return str.matches(REGEX);
//	}

	static boolean isNumber(String str) {
		if (str == null && str.equals(" ")) {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch < '0' || ch > '9') {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		}

	}

}
