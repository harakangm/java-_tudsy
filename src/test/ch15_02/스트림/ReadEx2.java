package test.ch15_02.스트림;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class ReadEx2 {

	public static void main(String[] args) {
		//inputStream: 파일이나 문자를 받아오고 읽음
		
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data); //최대 100 byte를 읽는다. 읽은 수는 리턴해줌. data에 읽은 내용 저장.
				
				if (num == -1) break; //파일에 끝에 도달했을때
				
				for (int i = 0; i < num; i++) {
					
					System.out.println(data[i]);
				}
				
			}
			is.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
