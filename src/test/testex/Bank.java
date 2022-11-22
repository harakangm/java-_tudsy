package test.testex;

import java.util.Scanner;

public class Bank {
	//스캐너 라이브러리(객체는) 클래스에서도 선언가능
	private static Scanner scanner = new Scanner(System.in);
	//클래스를 객체로 만듬
	//계좌객체를 담을 배열 (객체를 배열에 담을 수 있다)(초기값null)
	            //정보를 담을 객체
	private static Account2[] accountArray = new Account2[100];
 	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택");
			
			int selectNo = scanner.nextInt(); // 인트형으로 입력받음
			
			switch(selectNo){
		    case 1 : 
		    	CreateAccount();
		        break;
		    case 2 : 
		    	AccountList();
		        break;  
		    case 3 : 
		    	deposit();
		        break;  
		    case 4 : 
		    	withdraw();
		        break;  
		    default :
		    	
		    if(selectNo == 5) {
		    	run = false; 
		    }
		    System.out.println("프로그램 종료");
		}
	}
		
	
		
	}
	
	//static이 있어야 main 메소드에서 바로 호출 가능
	//1. 계좌 생성
	public static void CreateAccount() {
		System.out.println("------------------");
		System.out.println("계좌생성");
		System.out.println("------------------");
		
		System.out.println("계좌번호:");
		String accNumber= scanner.next();
		System.out.println("계좌주:");
		String owner = scanner.next();
		System.out.println("입금금액:");
		int balance = scanner.nextInt();
		//객체생성 계좌를 만듬 통장생성
		Account2 NewAcc = new Account2(accNumber, owner, balance);	
		
		for(int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = NewAcc; //생성한 계좌를 배열에 넣어준다;
				System.out.println("계좌 생성 완료");
				break; // 계좌 넣고 반복문 종료
			}
		}
	}
	
	//2. 계좌 목록
	public static void AccountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		for (int i = 0; i < accountArray.length; i++) {
			if (!(accountArray[i] == null)) {
				System.out.println(accountArray[i].getAccNumber());
				System.out.println(accountArray[i].getOwner());
				System.out.println(accountArray[i].getBalance());
				break;
			}
		}
	}
	
	//3. 예금
	public static void deposit() {
		
		System.out.println("계좌번호를 입력하세요");
		String accNumber = scanner.next();
		System.out.println("입금액를 입력하세요");
		int balance = scanner.nextInt();
		Account2 a = Bank.findAccount(accNumber);
		
		int c = a.getBalance() + balance;
		
		a.setBalance(c);
	}
	
	//4. 출금
	public static void withdraw() {
		System.out.println("계좌번호를 입력하세요");
		String accNumber = scanner.next();
		System.out.println(accNumber);
		System.out.println("출금액를 입력하세요");
		int balance = scanner.nextInt();
		Account2 a = Bank.findAccount(accNumber);
		
		int c = a.getBalance() - balance;
		
		a.setBalance(c);
	}
	
	//5. accountArray 배열에서 accNumber(계좌번호와)와 동일한 accNumber객체를 찾는 역활을 한다.
	private static Account2 findAccount(String accNumber) {
		for(int i = 0; i < accountArray.length; i ++) {
			if (accountArray[i].getAccNumber().equals(accNumber)) {
				return accountArray[i];
			}
		}
		return null;
	}
}
