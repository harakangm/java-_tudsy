package test.ch15_01.람다식;

//  @FunctionalInterface : 컴파일 할때 자동으로 추상메서드가 하나 인지 검사함(어노테이션)
 @FunctionalInterface
public interface Calculable {
//	public void calculate(int x, int y);
	public void calculate(int x);
}
