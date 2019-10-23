package cn.gdgm.filedemo;

public class Phone implements Usb {

	@Override
	public void install() {
		System.out.println("为手机安装usb驱动");
	}

	@Override
	public void work() {
		System.out.println("通过usb接口，来给手机传递数据");
	}
	
}
