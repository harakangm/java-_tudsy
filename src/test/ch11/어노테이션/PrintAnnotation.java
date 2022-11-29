package test.ch11.어노테이션;

import java.lang.annotation.*;

//라이브러리중하나 
//어노테이션 정의

//@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE}) // 내가 적용할 범위를 정함
@Target({ElementType.METHOD}) // 내가 적용할 범위를 정함

//@Retentio 유지정책, 어노테이션을 언제 시작해서 언제 까지 유지를 할것인지 지정.
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
	//에노테이션에 인터페이스
	//에노테이션에 규칙을 적음
	
	//값을 받아올 수 있다
	//default 어노테이션에서 주는 값이 아무것도 없으면 디폴트 값으로 줌
	String value() default "-"; //속성
	int number() default 15; //속성
	
}
