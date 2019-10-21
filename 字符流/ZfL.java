package task3;

import java.io.*;
import java.lang.management.ManagementPermission;

public class ZfL {
	
	public static void main(String[] args) {
//		m1();   //通过filereader读取文件的内容，一次读取一个字符
		m2();   //读取文本文件的内容，一次读取一个字符数组，异常处理，自动关闭
	}
	
	private static void m2() {
		try (
			FileReader fr = new FileReader("");
			){
			char[] contents = new char[1024];
			int len = fr.read(contents);
			while (len != -1) {
				//把读到的len个字符进行处理，转换为字符串打印
				System.out.println(contents);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void m1() throws IOException {
		//建立通道
		FileReader fr = new FileReader("d:/I Have a Dream.txt");
		//d:/I Have a Dream.txt虽然是GBK编码，当前环境是UTF8编码，d:/I Have a Dream.txt文件中都是英文字符，英文字符不管是GBK8还是UTF8都是一个字节
		//如果文件时GBK格式，文件中有中文，读取时会出现乱码
		//一般使用FileReader读取与当前环境一致的文件
		
		//read()一次读取一个字符，返回字符的码值，读到文件的末尾返回-1
		int cc = fr.read();
		while (cc != -1) {
			//把读到的字符打印到屏幕上
			System.out.println( (char)cc );
			 cc = fr.read();
		}
		fr.close();
	}
}
