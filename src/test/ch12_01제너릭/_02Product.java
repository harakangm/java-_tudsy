package test.ch12_01제너릭;

public class _02Product<K, M> { //타입 파라메터 정의
	//필드
	//현재는 무슨 타입이 올지 모르는 상태
	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
