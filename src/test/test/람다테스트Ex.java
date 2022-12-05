package test.test;

import java.util.Scanner;

public class 람다테스트Ex {

	public static void main(String[] args) {
		람다테스트 ex = new 람다테스트();
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();

		
		ex.check((x, y) -> x * y, z);
		
		
		ex.check(new 계산기() {

			@Override
			public int calc(int day, int money) {
				return day * money;
			}
			
		}, 10);
	}

	
	public static void plus() {
	}
	public static void minus() {}
}
