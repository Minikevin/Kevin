package cn.gdgm.test;

public class Dog {
	
	//没有在Dog定义这个类的时候，显示地写出Dog的构造方法，
	//运行的时候，系统会自动给我们的Dog类里增加一个默认的空构造
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
