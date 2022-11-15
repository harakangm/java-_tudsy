package test.ch06;

public class Earth {
	//상수(상수선언시 변수명을 대문자, 스네이크로 쓴다)
	//final: 절대 변경X , static : 전역 변수 
	static final double EARTH_RADIUS = 6400; //지구 둘레
	static final double EARTH_SURFACE_AREA;
	
	//스태틱 블록 : 스태틱 필드를 초기화 해줄때 사용
	static {
		EARTH_SURFACE_AREA = 4 *  Math.PI * EARTH_RADIUS * EARTH_RADIUS ;
	}
	
}
