package test.ch03;

public class 삼항연산자 {

	public static void main(String[] args) {
		// 삼항연산자
		int Scroe =85;
		char grade = (Scroe > 90) ? 'A' : ((Scroe > 80) ? 'B' : 'c');
		
		System.out.println(Scroe + "점은" + grade + "등급입니다.");
	}

}
