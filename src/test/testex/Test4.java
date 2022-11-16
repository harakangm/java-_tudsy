package test.testex;

	
public class Test4 {
	 static int max (int[] data) {
		 
		 int x;
		 
		 if ( data != null && data.length != 0) {
			 x = data[0];
			 for (int i = 0; i < data.length; i++) {
				 if( data[i] > x) {
					 x = data[i];
				 }
				 
			 }
		 }else{
			 return -999999;
		 }
		 return x;
	 }
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열


	}

}
