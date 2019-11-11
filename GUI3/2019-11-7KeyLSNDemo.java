package coursetest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//创建一个窗口类，按界面要求搭建
class KeyLsnFrame extends JFrame implements ActionListener {
	JTextField tf_input;
	JTextArea ta_data;
	JButton btn_send;

	public KeyLsnFrame() {
		this.setTitle("数据转移");
		this.setBounds(200, 150, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 创建lb_input、tf_input、btn_send组件对象
		JLabel lb_input = new JLabel("输入仅有数字的数据：");
		tf_input = new JTextField(10);
		tf_input.setFont(new Font("宋体", Font.BOLD, 16));
		tf_input.addActionListener(this);
		
		// 为tf_input组件注册键盘监听器
		tf_input.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() < '0' || e.getKeyChar() > '9') {
					System.out.println(e.getKeyChar() + "不是一个合法数字");
					e.consume();
				}
				System.out.println(e.getKeyChar());
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		btn_send = new JButton("发送");
		btn_send.addActionListener(this);
		ta_data = new JTextArea();
		ta_data.setFont(new Font("黑体", Font.BOLD, 16));
		ta_data.setEditable(false);
		
		// 创建中间容器pan_north，默认布局方式为流式布局
		JPanel pan_north = new JPanel();
		pan_north.setBackground(new Color(230, 100, 230));
		
		// 将lb_input、tf_input、btn_send组件对象添加到中间容器
		pan_north.add(lb_input);
		pan_north.add(tf_input);
		pan_north.add(btn_send);
		
		// 创建带滚动条的中间容器pan_ceter，此容器中只能添加一个组件
		JScrollPane pan_ceter = new JScrollPane();

		// 用方法setViewportView()往带滚动条的中间容器添加组件
		pan_ceter.setViewportView(ta_data);

		// 将中间容器pan_north添加到顶层容器this中
		this.add(pan_north, BorderLayout.NORTH);
		this.add(pan_ceter, BorderLayout.CENTER);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		StringBuffer strb_data = new StringBuffer();
		if (ta_data.getText().length() > 0)
			strb_data.append(ta_data.getText() + "\n\r");
		strb_data.append(tf_input.getText());
		ta_data.setText(strb_data.toString());
		tf_input.setText("");
		tf_input.requestFocus();
	}
}

public class KeyLSNDemo {

	public static void main(String[] args) {
		new KeyLsnFrame();
	}
}
