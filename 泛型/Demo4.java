package coursetest;

public class Demo4 {
	public static void main(String[] args) {
	Apple apple = new Apple();
	Person person = new Person();
	
	Generic1<Apple> generic = new Generic1<>();
	
	generic.show_1(apple);
//	generic.show_1(person);
	
	//����������ͷ����ͷ�������ʹ���˷��͵���ͨ�����������ܹ�������ǰ�ᣬ��ʹ�÷��ͷ����������ģ��;���ʹ�÷��ͷ���������ʹ�÷�����
	generic.show_2(apple);
	generic.show_2(person);
	
	generic.show_3(apple);
	generic.show_3(person);
}
}
