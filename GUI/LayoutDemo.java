package cn.gui;

import java.awt.BorderLayout;

public class LayoutDemo {

	public static void main(String[] args) {
		
		//JFrame默认布局方式为borderlayout
		
		JFrame frm_layout = new JFrame("来呀");
		JButton button = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JButton button5 = new JButton();
		JButton button6 = new JButton();
		frm_layout.add(button, BorderLayout.NORTH);
		frm_layout.add(button2, BorderLayout.EAST);
		frm_layout.add(button3, BorderLayout.SOUTH);
		frm_layout.add(button4, BorderLayout.WEST);
		frm_layout.add(button5, BorderLayout.CENTER);
		
		frm_layout.setVisible(true);
		frm_layout.setBounds(400, 200, 300, 200);
		frm_layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
