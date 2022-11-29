package test.ch11.리플렉션;

import java.lang.reflect.*;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;

public class ReflectionEx {

	public static void main(String[] args) {
		Class clazz = Car2.class; //Car객체에 대한 클래스 정보를 얻어옴
	
		
		System.out.println("[생성자 정보]");
		//생성자정보를 Constructor타입의 배열로 리턴해줌
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			//파라메터의 타입을 불러온다.
			Class[] Parameters = constructor.getParameterTypes();
			printParameters(Parameters);
			System.out.println(")");
		}
				
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			//필드 클래스의 getName()메서드를 이용해서 필드의 값을 스트링으로 리턴해줌
			System.out.println(field.getType().getName()+" "+field.getName());
		}
				
		System.out.println("[메서드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			//파라메터의 타입을 불러온다.
			Class[] Parameters = method.getParameterTypes();
			printParameters(Parameters);
			System.out.println(")");
		}
	}
	//메서드의 매개변수 타입을 출력하게 해주는 메서드
	public static void printParameters(Class[] Parameters) {
		for (int i = 0; i < Parameters.length;  i++) {
			System.out.print(Parameters[i].getName());
			//타입이 여러개가 있을때 타입옆에 ,를주는것
			if(i < Parameters.length-1) {
				System.out.print(",");
			}
		}
	}
}
