package test.ch10.사용자지정예외;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account(); //계좌 생성
		
		//저축
		account.deposit(10000); // 만원 저축
		
		System.out.println(account.getBalance());
		
		//출금
		try {
			account.withdraw(30000);
		} catch (InsuffException e) {
			String message = e.getMessage(); //에러 메세지 받기
			System.out.println(message);
		}
	}

}
