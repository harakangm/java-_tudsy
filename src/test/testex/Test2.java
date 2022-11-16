package test.testex;

public class Test2 {
	
	static boolean isNumber (String str) {	
		
//		String x = str.replaceAll("[^0-9]", "");
//		
//		if (!(str == null && str == " ")) {
//			if(str == x) {
//				return true;
//			}
//		}
//		
//		return false;
		final String REGEX = "[0-9]+";
//		str.matches(REGEX);
//		System.out.println(str.matches(REGEX));
		return str.matches(REGEX);
	}
	

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));




	}

}
