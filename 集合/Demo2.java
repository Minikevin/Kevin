package coursetest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Map hashmap = new HashMap();
		
		//���Ԫ�أ�put
		hashmap.put("key1", "val1");
		hashmap.put("key2", "val2");
		hashmap.put("key3", "val3");
		hashmap.put("key4", "val4");
		hashmap.put("key5", "val5");
		
		//ɾ��
		hashmap.remove("key5");
		
		//ͨ��������޸�map�����ֵ
		hashmap.put("key1", "val11");
		
		//ͨ��key��ȡvalue
		System.out.println(hashmap.get("key1"));
		
		//ͨ��hashmap��values����ȡ��������Ӧ��ֵ
		Collection values = hashmap.values();
		
		//��������ȡ��ֵ
		/*for(Object obj : values) {
			System.out.println(obj);
		}*/
		
		/*Set keySet = hashmap.keySet();
		
		for(Object obj : keySet) {
			//ͨ��get����ȡ��������Ӧ��ֵ
			System.out.println(obj);
			System.out.println("ֵ��" + hashmap.get(obj));
		}*/
		
		
		//��ȡ����ֵ
		Set <Map.Entry<String, String>> entrySet = hashmap.entrySet();
		for(Map.Entry<String, String> entry:entrySet) {
			System.out.println("key:" + entry.getKey());
			System.out.println("value:" + entry.getValue());
		}
	}
}
