package coursetest;

public class Generic<T> {//����һ��������
	
	private T key;
	
	public Generic(T key) {
		this.key = key;
	}
	
	public T getKey() {
		return key;
	}
}
