package test.ch12_01제너릭;

//1. 해당 클래스에서 제너릭 타입을 이용한다고 선언
// 내가 어떤 타입으로 받을지 모를때
public class Box<T> {
	// content 필드의 타입이 어떤것이 올지 모른다.
	public T content;
}
