package cn.gdgm.test;

public class DogMain {
	public static void main(String[] args) {
		Dog dog;// 声明一个变量，这个变量的类型是我们自己定义的Dog类型
		dog = new Dog();// 用new关键字，调用一个Dog类的构造方法，，这个时候，它返回一个Dog类型的对象

		// int没有给初始值的时候，默认值是0，boolean；false，所有应用类型的变量；null
		// 规则；类里边的普通方法，和普通的属性，必须只能通过new出来的某个对象的变量名再加上.符合来调用
		dog.setName("小白");
		dog.setAge(4);
		// 值保存在堆内存当中
	}
}
