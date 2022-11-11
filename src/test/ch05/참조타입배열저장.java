package test.ch05;

public class 참조타입배열저장 {

	public static void main(String[] args) {
//		String[] strArray = new String[3];
//		strArray[0] = "java";
//		strArray[1] = "java";
//		strArray[2] = new String("java");
//		
//		System.out.println(strArray[0] == strArray[1]);
//		System.out.println(strArray[0] == strArray[2]);
//		System.out.println(strArray[0].equals(strArray[2]));
		
		//배열을 복사해서 길이 늘리기
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		//배열복사	-> 배열의 크기 늘려줌
		//newIntArray에 oldIntArray값을 넣어주고
//		for(int i =0; i < oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
//		
		//배열 복사 제공 메서드
		//System.arraycopy(원본배열, 원본배열 복사 시작 인덱스, 새 배열, 새 배열 붙여넣기 시작 인덱스, 복사 항목 수)
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		// 출력해보면 보임
		for(int i =0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
//=========================================================
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		for (int score : scores) {
			System.out.println(score);
			sum += score;
		}
		System.out.println(sum);
	
		
	}

}
