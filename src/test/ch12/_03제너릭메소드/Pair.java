package test.ch12._03제너릭메소드;

public class Pair<K, V> {
	private K key;
	private V Value;
	
	public Pair(K key, V Value) {
		this.key = key;
		this.Value = Value;
	}

	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return Value;
	}

	public void setValue(V value) {
		Value = value;
	}
	
	
	
	
}
