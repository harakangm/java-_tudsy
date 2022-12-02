package test.ch12_01제너릭;

public class Main {

	public static void main(String[] args) {
		//제너릭의 장점 다양한 종류의 객체를 넣을 수있다
		//생산성이 높아진다
		//제너릭을 이용해서 다양한 제품을 생산할수있다.
		
		// K는 _02Tv타입 M은 스트링타입
		_02Product<_02Tv, String> product1 = new _02Product<>();
		product1.setKind(new _02Tv());
		product1.setModel("스마트TV");
		
		_02Tv t = product1.getKind();
		String tmodel = product1.getModel();
		System.out.println(tmodel);
		
		// K는 _02Car타입 M은 스트링타입
		_02Product<_02Car, String> product2 = new _02Product<>();
		
		product2.setKind(new _02Car());
		product2.setModel("전기자동차");
		
		_02Car c = product2.getKind();
		String cmodel = product2.getModel();

	}

}
