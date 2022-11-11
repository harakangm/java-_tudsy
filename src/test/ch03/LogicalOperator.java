package test.ch03;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int charCode = 'a';
		
		// & 과 && 기능은 같지만 &&의 전위연산자가 false면 후위를 계산하지 않음
		// & 앞에 것이 false라도 후위연산자를 확인함
		if ((65<=charCode) & (charCode<=90)) { // 65~90
			System.out.println("대문자이군요.");
		}
	
		if ((97<=charCode) && (charCode<=122)) { // 97~122
			System.out.println("소문자이군요.");
		}
		
		if ((48<=charCode) && (charCode<=57)) { // 48~57
			System.out.println("0~9 숫자군요.");
		}
		
		int value = 6;
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2또는 3의 배수");			
		}
		//효율성이 훨씬 높다
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의 배수");			
		}
		
		
	}

}
