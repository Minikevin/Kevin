package coursetest;

public class Generic1 <T> { //����һ��������
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
