package task3;

import java.io.*;
import java.lang.management.ManagementPermission;

public class ZfL {
	
	public static void main(String[] args) {
//		m1();   //ͨ��filereader��ȡ�ļ������ݣ�һ�ζ�ȡһ���ַ�
		m2();   //��ȡ�ı��ļ������ݣ�һ�ζ�ȡһ���ַ����飬�쳣�����Զ��ر�
	}
	
	private static void m2() {
		try (
			FileReader fr = new FileReader("");
			){
			char[] contents = new char[1024];
			int len = fr.read(contents);
			while (len != -1) {
				//�Ѷ�����len���ַ����д���ת��Ϊ�ַ�����ӡ
				System.out.println(contents);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void m1() throws IOException {
		//����ͨ��
		FileReader fr = new FileReader("d:/I Have a Dream.txt");
		//d:/I Have a Dream.txt��Ȼ��GBK���룬��ǰ������UTF8���룬d:/I Have a Dream.txt�ļ��ж���Ӣ���ַ���Ӣ���ַ�������GBK8����UTF8����һ���ֽ�
		//����ļ�ʱGBK��ʽ���ļ��������ģ���ȡʱ���������
		//һ��ʹ��FileReader��ȡ�뵱ǰ����һ�µ��ļ�
		
		//read()һ�ζ�ȡһ���ַ��������ַ�����ֵ�������ļ���ĩβ����-1
		int cc = fr.read();
		while (cc != -1) {
			//�Ѷ������ַ���ӡ����Ļ��
			System.out.println( (char)cc );
			 cc = fr.read();
		}
		fr.close();
	}
}
