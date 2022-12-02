package test.ch12._03제너릭메소드;


public class testEx {
	
	public static void main(String[] args) {
		Pair<Integer, String> pair1 = new Pair<Integer, String>(100 , "사과");
		Pair<Integer, String> pair2 = new Pair<Integer, String>(100 , "사과");
		
		boolean result = test.<Integer, String>compare(pair1,pair2);
		
		System.out.println(result);
		int a = pair1.getKey();
		String b = pair2.getValue();
		System.out.println();
		
		
		
	}

}
