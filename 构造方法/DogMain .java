package cn.gdgm.test;

public class DogMain {
	public static void main(String[] args) {
		Dog dog;// ����һ����������������������������Լ������Dog����
		dog = new Dog();// ��new�ؼ��֣�����һ��Dog��Ĺ��췽���������ʱ��������һ��Dog���͵Ķ���

		// intû�и���ʼֵ��ʱ��Ĭ��ֵ��0��boolean��false������Ӧ�����͵ı�����null
		// ��������ߵ���ͨ����������ͨ�����ԣ�����ֻ��ͨ��new������ĳ������ı������ټ���.����������
		dog.setName("С��");
		dog.setAge(4);
		// ֵ�����ڶ��ڴ浱��
	}
}
