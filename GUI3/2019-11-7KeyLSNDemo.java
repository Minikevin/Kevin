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

//����һ�������࣬������Ҫ��
class KeyLsnFrame extends JFrame implements ActionListener {
	JTextField tf_input;
	JTextArea ta_data;
	JButton btn_send;

	public KeyLsnFrame() {
		this.setTitle("����ת��");
		this.setBounds(200, 150, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ����lb_input��tf_input��btn_send�������
		JLabel lb_input = new JLabel("����������ֵ����ݣ�");
		tf_input = new JTextField(10);
		tf_input.setFont(new Font("����", Font.BOLD, 16));
		tf_input.addActionListener(this);
		
		// Ϊtf_input���ע����̼�����
		tf_input.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() < '0' || e.getKeyChar() > '9') {
					System.out.println(e.getKeyChar() + "����һ���Ϸ�����");
					e.consume();
				}
				System.out.println(e.getKeyChar());
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		btn_send = new JButton("����");
		btn_send.addActionListener(this);
		ta_data = new JTextArea();
		ta_data.setFont(new Font("����", Font.BOLD, 16));
		ta_data.setEditable(false);
		
		// �����м�����pan_north��Ĭ�ϲ��ַ�ʽΪ��ʽ����
		JPanel pan_north = new JPanel();
		pan_north.setBackground(new Color(230, 100, 230));
		
		// ��lb_input��tf_input��btn_send���������ӵ��м�����
		pan_north.add(lb_input);
		pan_north.add(tf_input);
		pan_north.add(btn_send);
		
		// ���������������м�����pan_ceter����������ֻ�����һ�����
		JScrollPane pan_ceter = new JScrollPane();

		// �÷���setViewportView()�������������м�����������
		pan_ceter.setViewportView(ta_data);

		// ���м�����pan_north��ӵ���������this��
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
