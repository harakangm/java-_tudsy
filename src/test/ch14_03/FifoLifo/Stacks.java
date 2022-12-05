package test.ch14_03.FifoLifo;

import java.util.Stack;

public class Stacks {
	
	public static void main(String[] args) {
		//스택을이용 Lifo : Last in first out
		//코인을 담을 수 있는 스택을 하나 만듬
		Stack<Coin> coinBox = new Stack<Coin>();

		// 동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 동전 꺼내기
		//isEmpty() : 현재 스택이 비어있는지에 대해서 물어보는 메서드
		// 비어있지 않다면 반복
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); //가져오기
			System.out.println("꺼내온 동전: " + coin.getValue());
		}
	}
	
}
