package cn.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrameDemo {

	public static void main(String[] args) {
		//创建了一个不可视窗口,也是一个窗口事件源		
		JFrame frame = new JFrame("测试窗口");
		
		//设置窗口可见		
		frame.setVisible(true);
		
		//设置窗口的位置和大小		
		frame.setBounds(400, 200, 300, 200);
		
		//通过事件处理实现关闭窗口时同时停止程序
		//创建一个window监听器对象		
		/*WindowListener myWindowListener = new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
	};
		//将监听器注册到事件源上		
		frame.addWindowListener(myWindowListener);*/
		
		//在窗口的基础上添加修改按钮
		//将事件源，事件，监听器绑定
		
		frame.setLayout(new FlowLayout());
		JButton btn_dialog = new JButton("点点点");
		btn_dialog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//创建了一个非模式对话框
		
				//JDialog dialog = new JDialog(frame, "点啊。");
				
				//创建模式对话框
				
				/*JDialog dialog = new JDialog(frame, "怎么不点了。",true);
				
				frame.setBounds(450, 270, 250, 100);
				dialog.setVisible(true);*/
				
				//创建消息对话框，可实现上面复杂的对话框功能
				
				JOptionPane.showMessageDialog(null, "点一次800元！", "怎么不点了", JOptionPane.WARNING_MESSAGE);
			}
		});
		frame.add(btn_dialog);
		
		//这是第二种关闭方法
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
