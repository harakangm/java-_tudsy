package test.ch05;

public class String메서드 {

	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입String 공부중";
		// 배열에 저장을함
		String[] tokens = board.split(",");
		
		for (int i = 0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	
//		
		
		
//		  String subject = "자바 프로그래밍"; 
//		  // indexOf(문자열) 주어진 문자열이 있으면 문자열의 시작인덱스 번호를 리턴해줌
//		  // 주어진 문자열이 없으면 -1을 찍음 
//		  int location = subject.indexOf("프로그래밍");
//		  System.out.println(location);
//		  
////		  String subString = subject.substring(location); 
////		  System.out.println(subString);
//		  
//		  // 문자열이 있는지 없는지 판단 
//		  if (location == -1) { System.out.println("해당 문자열이 없습니다.");
//		  }
//		  
//		  //해당문자열에 해당되면 true를 주고 아니면 false
//		  boolean result = subject.contains("자바");
//		  
//		  System.out.println(result);
//		  
//		  if (result) { System.out.println("자바와 관련된 책 입니다."); } else {
//		  System.out.println("자바와 관련 없는 책 입니다.");
//		  
		  }
		 
		 
		
		

		
//		  String ssn = "950624-1230123"; 
//		  //문자열을 잘라줌 substring(인덱스번호, 인덱스번호 이전까지 잘라줌)
//		  String firstName = ssn.substring(0, 6); 
//		  System.out.println(firstName);
//		  //시작인덱스부터 맨 끝자리까지 찍어줌 
//		  String secondName = ssn.substring(7);
//		  System.out.println(secondName);
		 

		
//		  String oldstr = "자바 문자열"; 
//		  //문자열을 바꾸는 메소드 replace 문자열자체를 리턴해줌 
//		  String newstr = oldstr.replace("자바", "JAVA");
//		  
//		  System.out.println(oldstr);
//		 

//		String ssn = "9506241230123"; // 주민번호
//		// charAt(index번호) String에서 인덱스 번호를 찾는거
//		char sex = ssn.charAt(6);
//		// 문자열의 길이 출력 인덱스번호가 아니라 순수하게 자릿수를 샘
//		int lenght = ssn.length();
//		
//		if (lenght == 13) {
//			System.out.println("주민번호 자릿수가 맞습니다");
//		} else {
//			System.out.println("주민번호 자릿수가 맞지 않습니다");
//
//		}
//
//		// 스위치문은 이렇게 쓸 수있다
//		switch (sex) {
//		case '1':
//		case '3':
//			System.out.println("남자");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자");
//			break;
//		}

	}

}
