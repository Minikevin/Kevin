package coursetest;

public class Generic1 <T> { //这是一个泛型类
	public void show_1(T t) {
		System.out.println(t.toString());
	}
	public <T> void show_2(T t) {
		System.out.println(t.toString());
	}
	public <E> void show_3(E e) {
		System.out.println(e.toString());
	}
}
