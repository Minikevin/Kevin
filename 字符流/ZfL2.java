package task3;

import java.io.FileWriter;
import java.io.IOException;

public class ZfL2 {
	public static void main(String[] args) throws IOException {
		//����ͨ��
		FileWriter fw = null;
		try {
			//����ļ������ڣ����Զ����������ھ͸��ǣ�Ҫ׷�Ӿ����ļ�������Ӹ�ture
			fw = new FileWriter("d:/hello.txt");
			
			//���ַ����浽�ļ���
			//һ��дһ���ַ�
			fw.write('A');
			fw.write('��');
			
			//һ�ο���дһ���ַ���
			fw.write("һ��дһ���ַ���");
			//����
			fw.write("\r\n");
			//һ��дһ���ַ�����
			char[] contents = "�������dj����ᰮ����".toCharArray();
			fw.write(contents);
			//���ַ�����Ĳ����ַ����浽�ļ���
			fw.write(contents, 0, 5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�ر�
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
