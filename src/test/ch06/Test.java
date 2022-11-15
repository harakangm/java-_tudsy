package test.ch06;

public class Test {

	public static void main(String[] args) {
		int[][] array = {
			      {95, 86},
			      {83, 92, 96},
			      {78, 83, 93, 87, 88}
			};
		
		int sum = 0;
		int sum2 = 0;
		for (int x = 0; x < array.length; x++) {
			sum2 += array[x].length;
			for (int y = 0; y < array[x].length; y++) {
				sum += array[x][y];
			}
		}

		System.out.println(array[0]);
		System.out.println(sum2);
		
		double y = (double)sum / sum2;
		System.out.println(y);
		
	}

}
