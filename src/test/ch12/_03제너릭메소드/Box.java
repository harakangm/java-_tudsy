package test.ch12._03제너릭메소드;

public class Box<T> {
	//클래스에서 받아온 T 아직 어떤 타입이 올지 모름
	//박스라는 객체를 생성할때 타입을 받아옴
	private T t;
	int a;
	
	public T get() {
		return t;
	}
	
	public void set (T t) {
		this.t = t;
	}
	
}
