package test.ch11.어노테이션;

import java.lang.reflect.*;

public class PrintAnnotationEx {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Service에서 만들어논 메서드의 정보가 배열형식으로 담김
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation printAno = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAno);
			
			//invoke(객체) 메서드를 실행시키는 함수
			method.invoke(new Service()); //메소드 실행
		}

	}

	public static void printLine(PrintAnnotation printAno) {
		if(printAno != null) {
			//number속성 값 얻기
			int number = printAno.number(); //number() 내가 만들어놓은 어노테이션의 속성의 값을 그대로가져옴
			String value = printAno.value();
			
			System.out.println(number);
			System.out.println(value);
		}
	}
}
