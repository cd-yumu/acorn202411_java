package test.mypac;

// Generic 클래스는 복수개 일수도 있다.
public class Pair<K,V> {
	//field
	private K key;
	private V value;
	
	//constructor
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	//method
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
