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
		//������һ�������Ӵ���,Ҳ��һ�������¼�Դ		
		JFrame frame = new JFrame("���Դ���");
		
		//���ô��ڿɼ�		
		frame.setVisible(true);
		
		//���ô��ڵ�λ�úʹ�С		
		frame.setBounds(400, 200, 300, 200);
		
		//ͨ���¼�����ʵ�ֹرմ���ʱͬʱֹͣ����
		//����һ��window����������		
		/*WindowListener myWindowListener = new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
	};
		//��������ע�ᵽ�¼�Դ��		
		frame.addWindowListener(myWindowListener);*/
		
		//�ڴ��ڵĻ���������޸İ�ť
		//���¼�Դ���¼�����������
		
		frame.setLayout(new FlowLayout());
		JButton btn_dialog = new JButton("����");
		btn_dialog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//������һ����ģʽ�Ի���
		
				//JDialog dialog = new JDialog(frame, "�㰡��");
				
				//����ģʽ�Ի���
				
				/*JDialog dialog = new JDialog(frame, "��ô�����ˡ�",true);
				
				frame.setBounds(450, 270, 250, 100);
				dialog.setVisible(true);*/
				
				//������Ϣ�Ի��򣬿�ʵ�����渴�ӵĶԻ�����
				
				JOptionPane.showMessageDialog(null, "��һ��800Ԫ��", "��ô������", JOptionPane.WARNING_MESSAGE);
			}
		});
		frame.add(btn_dialog);
		
		//���ǵڶ��ֹرշ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
