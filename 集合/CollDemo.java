package coursetest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("张三");
		collection.add("李四");
		collection.add("王五");
		
		Iterator iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println(str);
			
		}
	}
}
