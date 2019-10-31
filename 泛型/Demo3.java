package coursetest;

public class Demo3 {
	
	public static void main(String[] args) {
		
	}
	
	
	//这是一个典型的泛型方法，声明一个泛型T
	public <T> T show(Generic<T> generic) {
		System.out.println(generic.getKey());
		T t = generic.getKey();
		return t;
	}
}
