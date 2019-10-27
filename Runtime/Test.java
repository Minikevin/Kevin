package cn.gdgm.project;


public class Test {
	public static void main(String[] args) { //runtime在实际项目中很少使用
		
		//使用一下runtime类的对象，获取当前计算机的cpu的处理数量
		RtTest rt = RtTest.getRuntime();
		//System.out.println(rt.availableProcessors());
		
		System.out.println("jvm从物理内存中分配的空间内存：" + rt.totalMemory() + "btye");
		
		System.out.println("初始的时候，可用的内存：" + rt.freeMemory() + "btye");
		
		rt.gc();
		
		System.out.println("第一次gc后，可用的内存：" + rt.freeMemory() + "btye");
		
		//人为占用一部分内存
		
		Integer[] arr = new Integer[10000000];
		
		for(int i=0;i<10000000;i++){
			arr[i] = new Integer(i);
		}
		
		System.out.println("循环后，可用的内存：" + rt.freeMemory() + "btye");
		
		for(int i=0;i<10000000;i++){
			arr[i] = null; //这个操作就是我们引用删除掉，没有删除对象
		}
		
		rt.gc();
		
		System.out.println("第二次gc后，可用的内存：" + rt.freeMemory() + "btye");
		}
	}

