package 练习;

import java.util.*;
import java.util.List;
import java.util.concurrent.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;

import static 练习.Print.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import java.text.*;
class asd extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawRect(0,0,100,200);
	}
}
public class swing extends JFrame{
	asd ca=new asd();   //创建面板
	JButton a=new JButton("确定");   //按钮
	JLabel c=new JLabel();  //文本，字体
	JTextField d=new JTextField(10);   //文本框
	JCheckBox e=new JCheckBox("喜欢蛋糕");    //复选框
	JComboBox<String> f=new JComboBox<String>();   //下拉列表
	URL url=getClass().getResource("/imag/打开.png");
	Icon i=new ImageIcon(url);   //图标
	Graphics w;
	swing()
	{super("lianxi");
	setLayout(new FlowLayout());
		c.setToolTipText("ssss");
		add(ca);
		f.addActionListener((e)->{showaa();});
		e.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent q)
				{
					if(e.isSelected())
					{
						d.setEnabled(true);
					}
					else d.setEnabled(false);
				}
				});
		a.addActionListener((e)->{showaa();});
		setSize(800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	void pr(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawRect(0,0,100,200);
		
	}
	public void showaa()
	{
		String item=(String)f.getSelectedItem();
		Color co=null;
		if(item=="一")
			co=Color.red;
		else if(item=="蓝色")
			co=Color.BLUE;
		else co=Color.green;
		c.setForeground(co);
	}
	public static void main(String args[]){
		new swing();
	}
}