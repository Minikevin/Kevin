package cn.gdgm.project;


public class Test {
	public static void main(String[] args) { //runtime��ʵ����Ŀ�к���ʹ��
		
		//ʹ��һ��runtime��Ķ��󣬻�ȡ��ǰ�������cpu�Ĵ�������
		RtTest rt = RtTest.getRuntime();
		//System.out.println(rt.availableProcessors());
		
		System.out.println("jvm�������ڴ��з���Ŀռ��ڴ棺" + rt.totalMemory() + "btye");
		
		System.out.println("��ʼ��ʱ�򣬿��õ��ڴ棺" + rt.freeMemory() + "btye");
		
		rt.gc();
		
		System.out.println("��һ��gc�󣬿��õ��ڴ棺" + rt.freeMemory() + "btye");
		
		//��Ϊռ��һ�����ڴ�
		
		Integer[] arr = new Integer[10000000];
		
		for(int i=0;i<10000000;i++){
			arr[i] = new Integer(i);
		}
		
		System.out.println("ѭ���󣬿��õ��ڴ棺" + rt.freeMemory() + "btye");
		
		for(int i=0;i<10000000;i++){
			arr[i] = null; //�������������������ɾ������û��ɾ������
		}
		
		rt.gc();
		
		System.out.println("�ڶ���gc�󣬿��õ��ڴ棺" + rt.freeMemory() + "btye");
		}
	}

