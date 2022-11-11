package test.ch05;

public class 다차원배열 {

	public static void main(String[] args) {		
		// new로 생성 2행 3열
		int[][] mathScores = new int[2][3];
		
		for (int i =0; i <mathScores.length; i++) {
			for(int k = 0; k<mathScores[i].length; k++) {
				System.out.println("수학점수" +mathScores[i][k]);
			}
		}
//=============================================================
		// 다차원배열 선언
		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };

		System.out.println("1차원 배열 길이(반의 수)" + scores.length);
		System.out.println("2차원 배열 길이(첫번째 반의 학생 수)" + scores[0].length);
		System.out.println("2차원 배열 길이(두번째 반의 학생 수)" + scores[1].length);

		// 다차원 배열안에 값을 읽어오기
		System.out.println("첫번째 반의 세번쨰 학생:" + scores[0][2]);
		System.out.println("두번째 반의 두번쨰 학생:" + scores[1][1]);

		// 첫번쨰 반의 평균 점수

		int classSum = 0;

		for (int i = 0; i < scores[0].length; i++) {
			classSum += scores[0][i];
		}

		double class1Avg = (double) classSum / scores[0].length;
		System.out.println("첫번째 반의 평균:" + class1Avg);
		// ===================================================
		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두번째 반의 평균:" + class2Avg);

		// 전체 학생의 평균점수
		int totalStudent = 0;
		int totalSum = 0;

		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length; // 학생의 숫자

			for (int k = 0; k < scores[i].length; k++) {
				totalSum += scores[i][k]; // 점수를 합산함
			}

			double totalAvg = (double) totalSum / totalStudent;
			System.out.println("전체 학생 평균 :" + totalAvg);
			
		}

	}

}
