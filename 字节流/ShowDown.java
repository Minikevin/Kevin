package task3;

import java.awt.event.FocusAdapter;
import java.io.*;

public class ShowDown {
	public static void main(String[] args) throws Exception {
		String src = "d:/I Have a Dream.txt";
		String deString = "d:/1830523�ּҺ�ʵ����.txt";
		copyFile(src, deString);
		
	}
	
	//һ�θ���һ���ֽ����飬�쳣�����Զ��ر���
	public static void copyFile1(String srcFilename, String destFilename) throws Exception {
		try (
				FileInputStream fis = new FileInputStream(srcFilename);
				FileOutputStream fos = new FileOutputStream(destFilename);
				) {
			byte[] bytys = new byte[1024];  //�ֽ�����һ����1024��ż����
			int len = fis.read(bytys);
			while (len != -1) {
				fos.write(bytys, 0, len);
				len = fis.read(bytys);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//һ�θ���һ���ֽڣ��쳣�����ֶ��ر���
	public static void copyFile(String srcFilename, String destFilename) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fio = null;
		try {
		    fis = new FileInputStream(srcFilename);
			fio = new FileOutputStream(destFilename);
			
			int cc = fis.read();
			//���cc����-1���ͱ��浽Ŀ���ļ���
			while (cc != -1) {
			fio.write(cc);  //�Ѷ������ֽڱ��浽�������
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
