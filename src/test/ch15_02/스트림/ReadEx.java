package test.ch15_02.스트림;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class ReadEx {

	public static void main(String[] args) {
		//inputStream: 파일이나 문자를 받아오고 읽음
		
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while(true) {
				int data = is.read(); //1byte씩 읽음
				
				if (data == -1) break; //파일에 끝에 도달했을때
				
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
