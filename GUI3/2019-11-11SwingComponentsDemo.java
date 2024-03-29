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

	// 声明一个字符串数组
	String[] str_size = { "10号字体", "12号字体", "14号字体", "16号字体" };

	// 定义一个整型数组
	int[] int_size = { 10, 12, 14, 16 };
	JRadioButton[] rb_sizes = new JRadioButton[str_size.length];
	// JRadioButton rb_10,rb_12,rb_14,rb_16;

	// 把JLabel，JCheckBox定义到全局变量中去，这样可以在局部变量当中调用
	JLabel lb_txt;
	JCheckBox cb_Bold, cb_Italic;

	// 常规的创建窗口的操作，添加一系列的属性进去
	public ComponentFrame() {
		this.setTitle("改变字号和字形(18软件5班)");
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

		lb_txt = new JLabel("选择上面字号改变我的大小,选择下面字形改变我的字形。", JLabel.CENTER);
		Font font = new Font("宋体", Font.PLAIN, 13);
		lb_txt.setFont(font);

		JPanel pan_South = new JPanel();
		cb_Bold = new JCheckBox("粗体");
		cb_Italic = new JCheckBox("斜体");
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
		newFont = new Font("宋体", style, newSize);
		lb_txt.setFont(newFont);

	}
}
/*class ComponentFrame extends JFrame implements ActionListener{
JRadioButton rb_10,rb_12,rb_14,rb_16;
JLabel lb_txt;
JCheckBox cb_Bold,cb_Italic;
public ComponentFrame() {
	this.setTitle("改变字号和字形(18软件5班)");
	this.setBounds(300, 200, 400, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel pan_north=new JPanel();
	ButtonGroup bg_size=new ButtonGroup();
	 rb_10=new JRadioButton("10字号");
	 rb_12=new JRadioButton("12字号");
	 rb_14=new JRadioButton("14字号");
	 rb_16=new JRadioButton("16字号");
	rb_10.addActionListener(this);
	rb_12.addActionListener(this);
	rb_14.addActionListener(this);
	rb_16.addActionListener(this);
	bg_size.add(rb_10);
	bg_size.add(rb_12);
	bg_size.add(rb_14);
	bg_size.add(rb_16);
	
	ButtonGroup bg_sex=new ButtonGroup();
	JRadioButton rb_male=new JRadioButton("男");
	JRadioButton rb_female=new JRadioButton("女");
	bg_sex.add(rb_male);
	bg_sex.add(rb_female);		
	pan_north.add(rb_10);
	pan_north.add(rb_12);
	pan_north.add(rb_14);
	pan_north.add(rb_16);
	pan_north.add(rb_male);
	pan_north.add(rb_female);
	 lb_txt=new JLabel("选择上面字号改变我的大小,选择下面字形改变我的字形。",JLabel.CENTER);
	Font font=new Font("宋体",Font.PLAIN,13);
	lb_txt.setFont(font);
	
	JPanel pan_South=new JPanel();
	 cb_Bold=new JCheckBox("粗体");
	 cb_Italic=new JCheckBox("斜体");
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
	newFont=new Font("宋体",style,newSize);
	lb_txt.setFont(newFont);
	if(e.getSource() instanceof JRadioButton ){
		JRadioButton rb_Button=(JRadioButton)e.getSource();
		if(rb_Button==rb_10){
			newSize=10;
			// newFont=new Font("宋体",style,10);
			//lb_txt.setFont(newFont);
		}
		if(rb_Button==rb_12){
			newSize=12;
			 //newFont=new Font("宋体",style,12);
			//lb_txt.setFont(newFont);
		}
		if(rb_Button==rb_14){
			newSize=14;
			 //newFont=new Font("宋体",style,14);
			//lb_txt.setFont(newFont);
		}
		if(rb_Button==rb_16){
			newSize=16;
			 //newFont=new Font("宋体",style,16);
			//lb_txt.setFont(newFont);
		}
	}
	
		
	if(e.getSource() instanceof JCheckBox){
		JCheckBox cb_Box=(JCheckBox)e.getSource();
		if(cb_Box==cb_Bold){
			if(cb_Bold.isSelected()){
			Font newFont =new Font("宋体",Font.BOLD,oldSize);
			lb_txt.setFont(newFont);}
			else{
				Font newFont =new Font("宋体",Font.PLAIN,oldSize);
				lb_txt.setFont(newFont);
			}
			
		}
		if(cb_Box==cb_Italic){
			if(cb_Italic.isSelected()){
			Font newFont =new Font("宋体",Font.ITALIC,oldSize);
			lb_txt.setFont(newFont);}
			else {
				Font newFont =new Font("宋体",Font.PLAIN,oldSize);
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
