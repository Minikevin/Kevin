package coursetest;

public class Demo4 {
	public static void main(String[] args) {
	Apple apple = new Apple();
	Person person = new Person();
	
	Generic1<Apple> generic = new Generic1<>();
	
	generic.show_1(apple);
//	generic.show_1(person);
	
	//区别清楚泛型方法和泛型类中使用了泛型的普通方法，在你能够做到的前提，能使用泛型方法解决问题的，就尽量使用泛型方法，不必使用泛型类
	generic.show_2(apple);
	generic.show_2(person);
	
	generic.show_3(apple);
	generic.show_3(person);
}
}
