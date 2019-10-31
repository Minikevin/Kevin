package coursetest;

public class Generic<T> {//这是一个泛型类
	
	private T key;
	
	public Generic(T key) {
		this.key = key;
	}
	
	public T getKey() {
		return key;
	}
}
