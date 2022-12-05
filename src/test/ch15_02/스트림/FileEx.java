package test.ch15_02.스트림;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		//File("파일경로")
		File dir = new File("c:/temp/images"); //파일 경로 객체 생성
		File file1 = new File("c:/temp/file1.txt"); //파일 객체 생성
		File file2 = new File("c:/temp/file2.txt"); //파일 객체 생성
		File file3 = new File("c:/temp/file3.txt"); //파일 객체 생성

		//exists() : 해당경로에 파일이 있는 boolean값으로 리턴
		//mkdir() : 폴더을 만들어주는 메서드
		if(dir.exists() == false ) { dir.mkdir();}
		//파일이 없으면 파일을 생성해줌
		if(dir.exists() == false ) { file1.createNewFile();} 
		if(dir.exists() == false ) { file2.createNewFile();} 
		if(dir.exists() == false ) { file3.createNewFile();} 
		
		//Temp폴더의 파일, 폴더 리스트 출력
		File temp = new File("C:/temp");
		//listFiles() : 해당 폴더에 있는 파일 리스트를 배열의 형태로 가져옴
		File[] contents = temp.listFiles(); 
		
		for(File file : contents) {
			//isDirectory() : 디렉토리 인지 판단하는 메서드
			if (file.isDirectory()) { //폴더인지 판단
				System.out.println(file.getName()); // 파일의 이름을 찍어줌
			} else {
				System.out.println(file.getName()); // 디렉토리가 아니더라도 찍어줌
			}
		}
	}

}
