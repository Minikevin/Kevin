package coursetest;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class ComponentFrame extends JFrame implements ActionListener {

	// ����һ���ַ�������
	String[] str_size = { "10������", "12������", "14������", "16������" };

	// ����һ����������
	int[] int_size = { 10, 12, 14, 16 };
	JRadioButton[] rb_sizes = new JRadioButton[str_size.length];
	// JRadioButton rb_10,rb_12,rb_14,rb_16;

	// ��JLabel��JCheckBox���嵽ȫ�ֱ�����ȥ�����������ھֲ��������е���
	JLabel lb_txt;
	JCheckBox cb_Bold, cb_Italic;

	// ����Ĵ������ڵĲ���������һϵ�е����Խ�ȥ
	public ComponentFrame() {
		this.setTitle("�ı��ֺź�����(18����5��)");
		this.setBounds(300, 200, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan_north = new JPanel();
		ButtonGroup bg_size = new ButtonGroup();
		for (int i = 0; i < str_size.length; i++) {
			rb_sizes[i] = new JRadioButton(str_size[i]);
			rb_sizes[i].addActionListener(this);
			bg_size.add(rb_sizes[i]);
			pan_north.add(rb_sizes[i]);
		}

		lb_txt = new JLabel("ѡ�������ֺŸı��ҵĴ�С,ѡ���������θı��ҵ����Ρ�", JLabel.CENTER);
		Font font = new Font("����", Font.PLAIN, 13);
		lb_txt.setFont(font);

		JPanel pan_South = new JPanel();
		cb_Bold = new JCheckBox("����");
		cb_Italic = new JCheckBox("б��");
		pan_South.add(cb_Bold);
		pan_South.add(cb_Italic);
		cb_Bold.addActionListener(this);
		cb_Italic.addActionListener(this);
		this.add(pan_north, BorderLayout.NORTH);
		this.add(lb_txt, BorderLayout.CENTER);
		this.add(pan_South, BorderLayout.SOUTH);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Font oldFont = lb_txt.getFont();
		int oldSize = oldFont.getSize();
		int newSize = oldSize;
		int style = 0;
		Font newFont;
		for (int i = 0; i < int_size.length; i++) {
			if (rb_sizes[i].isSelected())
				newSize = int_size[i];
		}
		if (cb_Bold.isSelected())
			style = style + Font.BOLD;
		if (cb_Italic.isSelected())
			style = style + Font.ITALIC;
		newFont = new Font("����", style, newSize);
		lb_txt.setFont(newFont);

	}
}
/*class ComponentFrame extends JFrame implements ActionListener{
JRadioButton rb_10,rb_12,rb_14,rb_16;
JLabel lb_txt;
JCheckBox cb_Bold,cb_Italic;
public ComponentFrame() {
	this.setTitle("�ı��ֺź�����(18����5��)");
	this.setBounds(300, 200, 400, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel pan_north=new JPanel();
	ButtonGroup bg_size=new ButtonGroup();
	 rb_10=new JRadioButton("10�ֺ�");
	 rb_12=new JRadioButton("12�ֺ�");
	 rb_14=new JRadioButton("14�ֺ�");
	 rb_16=new JRadioButton("16�ֺ�");
	rb_10.addActionListener(this);
	rb_12.addActionListener(this);
	rb_14.addActionListener(this);
	rb_16.addActionListener(this);
	bg_size.add(rb_10);
	bg_size.add(rb_12);
	bg_size.add(rb_14);
	bg_size.add(rb_16);
	
	ButtonGroup bg_sex=new ButtonGroup();
	JRadioButton rb_male=new JRadioButton("��");
	JRadioButton rb_female=new JRadioButton("Ů");
	bg_sex.add(rb_male);
	bg_sex.add(rb_female);		
	pan_north.add(rb_10);
	pan_north.add(rb_12);
	pan_north.add(rb_14);
	pan_north.add(rb_16);
	pan_north.add(rb_male);
	pan_north.add(rb_female);
	 lb_txt=new JLabel("ѡ�������ֺŸı��ҵĴ�С,ѡ���������θı��ҵ����Ρ�",JLabel.CENTER);
	Font font=new Font("����",Font.PLAIN,13);
	lb_txt.setFont(font);
	
	JPanel pan_South=new JPanel();
	 cb_Bold=new JCheckBox("����");
	 cb_Italic=new JCheckBox("б��");
	pan_South.add(cb_Bold);
	pan_South.add(cb_Italic);
	cb_Bold.addActionListener(this);
	cb_Italic.addActionListener(this);
	this.add(pan_north,BorderLayout.NORTH);
	this.add(lb_txt,BorderLayout.CENTER);
	this.add(pan_South,BorderLayout.SOUTH);
	this.setVisible(true);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	Font oldFont= lb_txt.getFont();
	int oldSize=oldFont.getSize();
	int newSize=oldSize;
	int style =0;
	Font newFont;
	if(rb_10.isSelected()) newSize=10;
	if(rb_12.isSelected()) newSize=12;
	if(rb_14.isSelected()) newSize=14;
	if(rb_16.isSelected()) newSize=16;
	if(cb_Bold.isSelected())style=style+Font.BOLD;
	if(cb_Italic.isSelected()) style=style+Font.ITALIC;
	newFont=new Font("����",style,newSize);
	lb_txt.setFont(newFont);
	if(e.getSource() instanceof JRadioButton ){
		JRadioButton rb_Button=(JRadioButton)e.getSource();
		if(rb_Button==rb_10){
			newSize=10;
			// newFont=new Font("����",style,10);
			//lb_txt.setFont(newFont);
		}
		if(rb_Button==rb_12){
			newSize=12;
			 //newFont=new Font("����",style,12);
			//lb_txt.setFont(newFont);
		}
		if(rb_Button==rb_14){
			newSize=14;
			 //newFont=new Font("����",style,14);
			//lb_txt.setFont(newFont);
		}
		if(rb_Button==rb_16){
			newSize=16;
			 //newFont=new Font("����",style,16);
			//lb_txt.setFont(newFont);
		}
	}
	
		
	if(e.getSource() instanceof JCheckBox){
		JCheckBox cb_Box=(JCheckBox)e.getSource();
		if(cb_Box==cb_Bold){
			if(cb_Bold.isSelected()){
			Font newFont =new Font("����",Font.BOLD,oldSize);
			lb_txt.setFont(newFont);}
			else{
				Font newFont =new Font("����",Font.PLAIN,oldSize);
				lb_txt.setFont(newFont);
			}
			
		}
		if(cb_Box==cb_Italic){
			if(cb_Italic.isSelected()){
			Font newFont =new Font("����",Font.ITALIC,oldSize);
			lb_txt.setFont(newFont);}
			else {
				Font newFont =new Font("����",Font.PLAIN,oldSize);
				lb_txt.setFont(newFont);
			}
		}
	}
	
	
}
}*/

public class SwingComponentsDemo {

	public static void main(String[] args) {
		new ComponentFrame();
	}
}