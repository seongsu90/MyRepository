package ch13.exam04;

public interface Map <K,V>{
	void add(K k,V v); //제네릭 메소드라고 한다.
	
	V get(K k); //get 메소드에 K 타입이 들어가면 V값으로 리턴된다.
	
}
