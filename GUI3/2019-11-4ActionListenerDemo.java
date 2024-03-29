package coursetest;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

//创建一个窗口：Action事件窗口
//窗口大小：300，200
//当关闭窗口时同时关闭程序
//窗口要可见
//窗口里面添加四个按钮和一个标签

//将当前窗口类实现了ActionListener（事件监听接口）所以当前窗口对象也是一个监听器对象了
class ActionFrame extends JFrame implements ActionListener {

	JLabel lb_text = null;
	JButton btn_1, btn_2, btn_3, btn_4;

	// 用内部类创建监听器
	/*
	 * class MyActionListener implements ActionListener{
	 * 
	 * @Override public void actionPerformed(ActionEvent e) {
	 * lb_text.setText("有按钮被按下。"); } }
	 */
	public ActionFrame() {

		this.setTitle("Action事件窗口");
		this.setBounds(300, 250, 350, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		lb_text = new JLabel("我是一个标签");
		lb_text.setFont(new Font("宋体", Font.BOLD, 14));
		// 1.创建事件源：tn_1
		btn_1 = new JButton("字号:10");
		// 2.创建监听器
		// 3.将监听器注册到事件源上
		// 通过匿名内部类创建的监听器
		/*
		 * btn_1.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent arg0) {
		 * lb_text.setText("有按钮被按下。"); } });
		 */
		// MyActionListener cListener=new MyActionListener();
		// btn_1.addActionListener(cListener);
		// this此时是一个动作事件监听器
		btn_1.addActionListener(this);
		btn_2 = new JButton("字号:12");
		btn_2.addActionListener(this);
		// btn_2.addActionListener(cListener);
		btn_3 = new JButton("字号:14");
		btn_3.addActionListener(this);
		// btn_3.addActionListener(cListener);
		btn_4 = new JButton("字号:16");
		btn_4.addActionListener(this);
		// btn_4.addActionListener(cListener);
		// 创建一个中间容器：JPanel
		JPanel pal_btn = new JPanel();
		// 将四个按钮放入中间容器pal_btn
		pal_btn.add(btn_1);
		pal_btn.add(btn_2);
		pal_btn.add(btn_3);
		pal_btn.add(btn_4);
		// 将中间容器放到窗口中
		this.add(pal_btn, BorderLayout.NORTH);

		this.add(lb_text, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str_source = "";
		if (e.getSource() instanceof JButton) {
			str_source = ((JButton) e.getSource()).getText();
		}

		lb_text.setText(str_source + "被按下。");
		if (((JButton) e.getSource()) == btn_1) {
			lb_text.setFont(new Font("宋体", Font.BOLD, 10));
		}
		if (((JButton) e.getSource()) == btn_2) {
			lb_text.setFont(new Font("宋体", Font.BOLD, 12));
		}
		if (((JButton) e.getSource()) == btn_3) {
			lb_text.setFont(new Font("宋体", Font.BOLD, 14));
		}
		if (((JButton) e.getSource()) == btn_4) {
			lb_text.setFont(new Font("宋体", Font.BOLD, 16));
		}
		/*if(str_source.equals("字号:10"))
		lb_text.setFont(new Font("宋体",Font.BOLD,10));
	if(str_source.equals("字号:12"))
	lb_text.setFont(new Font("宋体",Font.BOLD,12));
	if(str_source.equals("字号:14"))
		lb_text.setFont(new Font("宋体",Font.BOLD,14));
	if(str_source.equals("字号:16"))
		lb_text.setFont(new Font("宋体",Font.BOLD,16));*/
	//JOptionPane.showMessageDialog(null, "有按钮被按下。");
		
	}
}

public class ActionListenerDemo {

	public static void main(String[] args) {
		new ActionFrame();
	}
}
