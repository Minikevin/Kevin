package coursetest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("����");
		collection.add("����");
		collection.add("����");
		
		Iterator iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println(str);
			
		}
	}
}
