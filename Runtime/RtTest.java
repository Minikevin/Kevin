package cn.gdgm.project;

import java.io.IOException;

public class RtTest {
	public static void main(String[] args) {
		//�õ�Rt
		Runtime rt = Runtime.getRuntime();
		Process P = null;
		
		try {
			P = rt.exec("notepad");
			Thread.sleep(3000); //�ڵȴ�һ��ʱ������ִ����һ������
			P.destroy();  //ɱ���ӽ���
			//P.waitFor();  //�ȴ��򿪵��³���ִ������Ժ󣬲ż��������java������Ϊֻ�йرս��̲Ž�����һ���Ĳ���
		} catch (Exception  e) {//���û�ж���ͷ���p
			System.out.println("���ü��±�ʧ�ܣ�");
		}
		
		System.out.println("exec��������ĳ���");
	}
	
}
