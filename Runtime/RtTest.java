package cn.gdgm.project;

import java.io.IOException;

public class RtTest {
	public static void main(String[] args) {
		//拿到Rt
		Runtime rt = Runtime.getRuntime();
		Process P = null;
		
		try {
			P = rt.exec("notepad");
			Thread.sleep(3000); //在等待一段时间过后才执行下一个进程
			P.destroy();  //杀死子进程
			//P.waitFor();  //等待打开的新程序，执行完成以后，才继续后面的java程序，意为只有关闭进程才进行下一步的操作
		} catch (Exception  e) {//如果没有对象就返回p
			System.out.println("调用记事本失败！");
		}
		
		System.out.println("exec方法后面的程序");
	}
	
}
