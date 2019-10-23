package cn.gdgm.filedemo;

public class Test {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Phone phone = new Phone();
		Print print = new Print();
		computer.plugin(phone);
		computer.plugin(print);
}
}
