package task3;

import java.io.FileWriter;
import java.io.IOException;

public class ZfL2 {
	public static void main(String[] args) throws IOException {
		//建立通道
		FileWriter fw = null;
		try {
			//如果文件不存在，会自动创建，存在就覆盖，要追加就在文件名后面加个ture
			fw = new FileWriter("d:/hello.txt");
			
			//把字符保存到文件中
			//一次写一个字符
			fw.write('A');
			fw.write('汉');
			
			//一次可以写一个字符串
			fw.write("一次写一个字符串");
			//换行
			fw.write("\r\n");
			//一次写一个字符数组
			char[] contents = "如果我是dj，你会爱我吗？".toCharArray();
			fw.write(contents);
			//把字符数组的部分字符保存到文件中
			fw.write(contents, 0, 5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭
			if(fw != null){
				try {
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
