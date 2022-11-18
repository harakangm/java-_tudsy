package test.testex;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	private static String[] createid = {"1.계좌생성" , "2.계좌목록" , "3.예금" ,  "4출금"  , "5종료"};
	private static Account2[] accounts= new Account2[100];
	
	static void setaccounts() {
		Account2 account = new Account2();
		
	}
	
	public static void GetStartCreate() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(Arrays.toString(createid));
			System.out.println("선택> ");
			String strX = scanner.nextLine();
			int x  = Integer.parseInt(strX);
			
			if ( x == 5) {
				System.out.println("종료");
				break;
			}
			System.out.println("----------------");
			System.out.println(createid[x-1]);
			System.out.println("----------------");
			
			switch(x){
			case 1 : 
				
				break;
			case 2 : 
				
				break; 
			case 3 :
				
				break;
				
			case 4:
				
				break;
			case 5:
				
				break;
			default :
		}
			

   
	}


	}
}
