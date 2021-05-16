package java上机2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
class mypanel extends JPanel
{
public void paint(Graphics g)	
{
	g.setColor(Color.green);
	
}
}
public class jframe extends JFrame{
	public jframe(manager o)
	{
		JPanel t=new JPanel()
				{
					public void paint(Graphics g)
					{
						for(GeometricaObject i:o.a)
						{if(i instanceof yuan)
							g.drawOval(i.p.x,i.p.y,(int)((yuan)i).get(),(int)((yuan)i).get());
						else if(i instanceof juxing)
							g.drawRect(i.p.x,i.p.y,(int)((juxing)i).getx(),(int)((juxing)i).gety());
						else
						{
							ArrayList<duo> a=((duobian)i).a;
							for(int j=0;j<a.size()-1;j++)
							{
								g.drawLine(a.get(j).x,a.get(j).y,a.get(j+1).x,a.get(j+1).y);
							}
							g.drawLine(a.get(0).x,a.get(0).y,a.get(a.size()-1).x,a.get(a.size()-1).y);
						}
						}
					}
				};
		add(t);
		setTitle("图形绘制");
		setSize(1200,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
