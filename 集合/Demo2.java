package coursetest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Map hashmap = new HashMap();
		
		//添加元素，put
		hashmap.put("key1", "val1");
		hashmap.put("key2", "val2");
		hashmap.put("key3", "val3");
		hashmap.put("key4", "val4");
		hashmap.put("key5", "val5");
		
		//删除
		hashmap.remove("key5");
		
		//通过添加来修改map里面的值
		hashmap.put("key1", "val11");
		
		//通过key获取value
		System.out.println(hashmap.get("key1"));
		
		//通过hashmap的values方法取到它所对应的值
		Collection values = hashmap.values();
		
		//遍历集合取出值
		/*for(Object obj : values) {
			System.out.println(obj);
		}*/
		
		/*Set keySet = hashmap.keySet();
		
		for(Object obj : keySet) {
			//通过get方法取到键所对应的值
			System.out.println(obj);
			System.out.println("值：" + hashmap.get(obj));
		}*/
		
		
		//获取键和值
		Set <Map.Entry<String, String>> entrySet = hashmap.entrySet();
		for(Map.Entry<String, String> entry:entrySet) {
			System.out.println("key:" + entry.getKey());
			System.out.println("value:" + entry.getValue());
		}
	}
}
