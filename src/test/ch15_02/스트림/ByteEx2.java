package test.ch15_02.스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteEx2 {
	
	public static void main(String[] args) {
		//바이트 출력스트림:그림, 멀티미어 ,문자등 모든 종류의 데이터를 입출력할때 사용
		
		try {
			//FileOutputStream(): 출력 스트림 외부에다 파일을 내보냄
			//(경로/이름.확장자명)
			FileOutputStream fo = new FileOutputStream("C:/Temp/test2.db");
			//배열로 넣어줌
			byte[] array = {10, 20, 30};
			
			fo.write(array); // 버퍼에 출력해줌
			
			fo.flush(); // 버퍼에 있는 바이트를 출력하고 버퍼를 비움(test.db에 작성된다.);
			
			//출력스트림은 반드시 닫아서 사용한 메모리를 해제.
			fo.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
