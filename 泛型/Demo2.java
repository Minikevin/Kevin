package coursetest;

public class Demo2 {

	public static void main(String[] args) {
		//��g1��ֵ���ԣ�����g2��ֵ��ʱ�������ֱ������ʱ����Ҫ����ͨ��������<?>,?�����������ʵ�Ρ�
		Generic<Number> g1 = new Generic<Number>(123);
		Generic<Integer> g2 = new Generic<Integer>(321);
		show(g2);
		
	}
	
	public static void show(Generic<?> generic) {
		System.out.println("genric" + generic.getKey());
	}
}
