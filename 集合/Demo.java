package coursetest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		
		Collection collection = new ArrayList();
		
		//添加元素
		collection.add("张三");
		collection.add("李四");
		collection.add("王五");
		collection.add("赵六");
		
		//集合的遍历方式，可以用迭代器或者for，each循环
		/*Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println("iterator:" + name);
		}
		
		for(Object obj : collection) {
			System.out.println("for:" + obj);
		}*/
		
		collection.add("赵六");//添加删除操作之后都遍历一下会比较好
		
		for(Object obj : collection) {
			System.out.println("for:" + obj);
		}
		
		//删除
		collection.remove("赵六");
		
		for(Object obj : collection) {
			System.out.println("for:" + obj);
		}
		
		//删除全部元素
		System.out.println("---------------");
		collection.removeAll(collection);
		
		for(Object obj : collection) {
			System.out.println("for:" + obj);
		}
		
		System.out.println(collection.isEmpty());//查看是否为空
		
	}
}
