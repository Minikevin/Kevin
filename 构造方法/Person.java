package model;

public class Person {
	
	private int age;
	private String sex;
	private String name;
	public Person(){}//空构造
	//显示的写出构造方法，构造函数
	public Person(int age,String name,String sex){
		//默认的构造函数里什么都没有，一般情况写出构造函数的目的，初始化
		this.age=age;
		this.name=name;
		this.sex=sex;
		
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", sex=" + sex + ", name=" + name + "]";
	}
}
