package ��ϰ;

import java.util.*;
import java.util.List;
import java.util.concurrent.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;

import static ��ϰ.Print.*;

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
	asd ca=new asd();   //�������
	JButton a=new JButton("ȷ��");   //��ť
	JLabel c=new JLabel();  //�ı�������
	JTextField d=new JTextField(10);   //�ı���
	JCheckBox e=new JCheckBox("ϲ������");    //��ѡ��
	JComboBox<String> f=new JComboBox<String>();   //�����б�
	URL url=getClass().getResource("/imag/��.png");
	Icon i=new ImageIcon(url);   //ͼ��
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
		if(item=="һ")
			co=Color.red;
		else if(item=="��ɫ")
			co=Color.BLUE;
		else co=Color.green;
		c.setForeground(co);
	}
	public static void main(String args[]){
		new swing();
	}
}