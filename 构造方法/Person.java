package model;

public class Person {
	
	private int age;
	private String sex;
	private String name;
	public Person(){}//�չ���
	//��ʾ��д�����췽�������캯��
	public Person(int age,String name,String sex){
		//Ĭ�ϵĹ��캯����ʲô��û�У�һ�����д�����캯����Ŀ�ģ���ʼ��
		this.age=age;
		this.name=name;
		this.sex=sex;
		
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", sex=" + sex + ", name=" + name + "]";
	}
}
