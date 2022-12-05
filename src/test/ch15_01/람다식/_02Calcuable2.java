package test.ch15_01.람다식;

@FunctionalInterface //추상메서드가 하나만 있는지 컴파일 과정에서 체크
 interface _02Calcuable2 {
	//람다식을 이용하기 위해서는 람다식은 추상메서드가 하나만 있어야함
	public double calc(double x , double y);
}
