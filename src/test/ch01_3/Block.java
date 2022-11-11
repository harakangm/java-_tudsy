package test.ch01_3;

public class Block {

	public static void main(String[] args) {
		int v1 = 15;
		
		if (v1 > 10) {
			// 밖에서는 안으로 접근 가능 v1 값
			int v2 = v1 - 10;
		}
		//지역변수 v2의 값은 if문안에 있어서 값을 못불러옴
		int v3  = v1 + v2 + 5;

	}

}
