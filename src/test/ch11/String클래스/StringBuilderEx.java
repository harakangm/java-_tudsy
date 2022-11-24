package test.ch11.String클래스;

public class StringBuilderEx {

	public static void main(String[] args) {
		//StringBuilder가 있는 이유 문자열을 수정하거나 삭제하면 새로운 객체가 생성됨 이때 쓰레기 객체가 생성되지 않게 할때 사용
		String data = new StringBuilder()
						//문자열 끝에 값을 붙여줌
						 .append("DEF")
						//중간에 넣음 (인덱스번호 , 추가 문자열) 인덱스 위치에서 시작
						 .insert(0, "abc")
						// 문자열의 일부를 삭제 (시작인덱스번호, 끝인덱스번호) 끝인덱스 이전에 끝남
						 .delete(3,4)
						 //완성된 문자열을 String 타입으로 리턴
						 .toString();
		System.out.println(data);
				
	}	

}
