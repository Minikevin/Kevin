package cn.gdgm.filedemo;

public class Print implements Usb {

	@Override
	public void install() {
		System.out.println("Ϊ��ӡ����װusb����");
	}

	@Override
	public void work() {
		System.out.println("��ӡ������ͨ��usb�ӿ�����ӡ�ĵ�");
	}

}
