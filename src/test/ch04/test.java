package test.ch04;

public class test {

	public static void main(String[] args) {
		
		int sum = 0;
		int s = 1;
		int num = 0;
		
		for (int i = 1; true; i++, s = -s) {
			num = s*i;
			sum +=sum;
			
			if(sum >= 100) {
				break;
			}
			System.out.println(num);
			System.out.println(sum);
		}
	}
}
