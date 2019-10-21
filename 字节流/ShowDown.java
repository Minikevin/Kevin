package task3;

import java.awt.event.FocusAdapter;
import java.io.*;

public class ShowDown {
	public static void main(String[] args) throws Exception {
		String src = "d:/I Have a Dream.txt";
		String deString = "d:/1830523林家豪实验三.txt";
		copyFile(src, deString);
		
	}
	
	//一次复制一个字节数组，异常处理，自动关闭流
	public static void copyFile1(String srcFilename, String destFilename) throws Exception {
		try (
				FileInputStream fis = new FileInputStream(srcFilename);
				FileOutputStream fos = new FileOutputStream(destFilename);
				) {
			byte[] bytys = new byte[1024];  //字节数字一般是1024的偶数倍
			int len = fis.read(bytys);
			while (len != -1) {
				fos.write(bytys, 0, len);
				len = fis.read(bytys);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//一次复制一个字节，异常处理，手动关闭流
	public static void copyFile(String srcFilename, String destFilename) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fio = null;
		try {
		    fis = new FileInputStream(srcFilename);
			fio = new FileOutputStream(destFilename);
			
			int cc = fis.read();
			//如果cc不是-1，就保存到目标文件中
			while (cc != -1) {
			fio.write(cc);  //把读到的字节保存到输出流中
			cc = fis.read();
			}
			fio.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (fio != null) {
				try {
					fio.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	}
