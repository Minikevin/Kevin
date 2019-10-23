package cn.gdgm.filedemo;

public class Computer {

	public void plugin(Usb usb) {
		usb.install();//表面上，我们调用的是接口里的方法，实质上真正调用的是链接上电脑的设备里实现的具体的方法
		usb.work();
	}
}
