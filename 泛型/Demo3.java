package coursetest;

public class Demo3 {
	
	public static void main(String[] args) {
		
	}
	
	
	//����һ�����͵ķ��ͷ���������һ������T
	public <T> T show(Generic<T> generic) {
		System.out.println(generic.getKey());
		T t = generic.getKey();
		return t;
	}
}
