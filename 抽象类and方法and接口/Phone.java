package cn.gdgm.filedemo;

public class Phone implements Usb {

	@Override
	public void install() {
		System.out.println("Ϊ�ֻ���װusb����");
	}

	@Override
	public void work() {
		System.out.println("ͨ��usb�ӿڣ������ֻ���������");
	}
	
}
