package coursetest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		
		Collection collection = new ArrayList();
		
		//���Ԫ��
		collection.add("����");
		collection.add("����");
		collection.add("����");
		collection.add("����");
		
		//���ϵı�����ʽ�������õ���������for��eachѭ��
		/*Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println("iterator:" + name);
		}
		
		for(Object obj : collection) {
			System.out.println("for:" + obj);
		}*/
		
		collection.add("����");//���ɾ������֮�󶼱���һ�»�ȽϺ�
		
		for(Object obj : collection) {
			System.out.println("for:" + obj);
		}
		
		//ɾ��
		collection.remove("����");
		
		for(Object obj : collection) {
			System.out.println("for:" + obj);
		}
		
		//ɾ��ȫ��Ԫ��
		System.out.println("---------------");
		collection.removeAll(collection);
		
		for(Object obj : collection) {
			System.out.println("for:" + obj);
		}
		
		System.out.println(collection.isEmpty());//�鿴�Ƿ�Ϊ��
		
	}
}
