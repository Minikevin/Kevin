package coursetest;

public class Demo2 {

	public static void main(String[] args) {
		//传g1的值可以，但传g2的值的时候编译出现报错，这个时候需要泛型通配符来解决<?>,?代替的是类型实参。
		Generic<Number> g1 = new Generic<Number>(123);
		Generic<Integer> g2 = new Generic<Integer>(321);
		show(g2);
		
	}
	
	public static void show(Generic<?> generic) {
		System.out.println("genric" + generic.getKey());
	}
}
