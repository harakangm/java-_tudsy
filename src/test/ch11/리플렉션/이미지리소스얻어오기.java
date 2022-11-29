package test.ch11.리플렉션;

public class 이미지리소스얻어오기 {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		//getResource 리소스에 대한정보를 리턴 getPath 경로를 리턴
		String photo1Path = clazz.getResource("logo.gif").getPath();
		String photo2Path = clazz.getResource("images/logo.gif").getPath();
		
		//각각의 절대경로를 리턴해줌
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
