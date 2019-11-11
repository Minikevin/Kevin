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

//����һ�����ڣ�Action�¼�����
//���ڴ�С��300��200
//���رմ���ʱͬʱ�رճ���
//����Ҫ�ɼ�
//�������������ĸ���ť��һ����ǩ

//����ǰ������ʵ����ActionListener���¼������ӿڣ����Ե�ǰ���ڶ���Ҳ��һ��������������
class ActionFrame extends JFrame implements ActionListener {

	JLabel lb_text = null;
	JButton btn_1, btn_2, btn_3, btn_4;

	// ���ڲ��ഴ��������
	/*
	 * class MyActionListener implements ActionListener{
	 * 
	 * @Override public void actionPerformed(ActionEvent e) {
	 * lb_text.setText("�а�ť�����¡�"); } }
	 */
	public ActionFrame() {

		this.setTitle("Action�¼�����");
		this.setBounds(300, 250, 350, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		lb_text = new JLabel("����һ����ǩ");
		lb_text.setFont(new Font("����", Font.BOLD, 14));
		// 1.�����¼�Դ��tn_1
		btn_1 = new JButton("�ֺ�:10");
		// 2.����������
		// 3.��������ע�ᵽ�¼�Դ��
		// ͨ�������ڲ��ഴ���ļ�����
		/*
		 * btn_1.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent arg0) {
		 * lb_text.setText("�а�ť�����¡�"); } });
		 */
		// MyActionListener cListener=new MyActionListener();
		// btn_1.addActionListener(cListener);
		// this��ʱ��һ�������¼�������
		btn_1.addActionListener(this);
		btn_2 = new JButton("�ֺ�:12");
		btn_2.addActionListener(this);
		// btn_2.addActionListener(cListener);
		btn_3 = new JButton("�ֺ�:14");
		btn_3.addActionListener(this);
		// btn_3.addActionListener(cListener);
		btn_4 = new JButton("�ֺ�:16");
		btn_4.addActionListener(this);
		// btn_4.addActionListener(cListener);
		// ����һ���м�������JPanel
		JPanel pal_btn = new JPanel();
		// ���ĸ���ť�����м�����pal_btn
		pal_btn.add(btn_1);
		pal_btn.add(btn_2);
		pal_btn.add(btn_3);
		pal_btn.add(btn_4);
		// ���м������ŵ�������
		this.add(pal_btn, BorderLayout.NORTH);

		this.add(lb_text, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str_source = "";
		if (e.getSource() instanceof JButton) {
			str_source = ((JButton) e.getSource()).getText();
		}

		lb_text.setText(str_source + "�����¡�");
		if (((JButton) e.getSource()) == btn_1) {
			lb_text.setFont(new Font("����", Font.BOLD, 10));
		}
		if (((JButton) e.getSource()) == btn_2) {
			lb_text.setFont(new Font("����", Font.BOLD, 12));
		}
		if (((JButton) e.getSource()) == btn_3) {
			lb_text.setFont(new Font("����", Font.BOLD, 14));
		}
		if (((JButton) e.getSource()) == btn_4) {
			lb_text.setFont(new Font("����", Font.BOLD, 16));
		}
		/*if(str_source.equals("�ֺ�:10"))
		lb_text.setFont(new Font("����",Font.BOLD,10));
	if(str_source.equals("�ֺ�:12"))
	lb_text.setFont(new Font("����",Font.BOLD,12));
	if(str_source.equals("�ֺ�:14"))
		lb_text.setFont(new Font("����",Font.BOLD,14));
	if(str_source.equals("�ֺ�:16"))
		lb_text.setFont(new Font("����",Font.BOLD,16));*/
	//JOptionPane.showMessageDialog(null, "�а�ť�����¡�");
		
	}
}

public class ActionListenerDemo {

	public static void main(String[] args) {
		new ActionFrame();
	}
}