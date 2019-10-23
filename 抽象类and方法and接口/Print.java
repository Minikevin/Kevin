package cn.gdgm.filedemo;

public class Print implements Usb {

	@Override
	public void install() {
		System.out.println("为打印机安装usb驱动");
	}

	@Override
	public void work() {
		System.out.println("打印机可以通过usb接口来打印文档");
	}

}
