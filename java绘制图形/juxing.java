package java�ϻ�2;

class juxingexce extends Exception
{
public void jiejue()
{
	System.out.println("���εĳ��Ϳ����Ǹ���");
	printStackTrace();
	System.exit(0);
}
}
public class juxing extends GeometricaObject
{
private double x;
private double y;
juxing(double x,double y,int a,int b)
{try
{
if(x<0|y<0)
{
	throw new juxingexce();
}
}catch(juxingexce e)
{
	e.jiejue();
}
this.x=x;this.y=y;
p=new point2D(a,b);
}
public double zhouchang()
{
	return 2*(x+y);
}
public double getx()
{
return x;	
}
public double gety()
{
return y;	
}
public double mianji()
{
	return x*y;
}
public boolean equals(Object i)
{
	return i instanceof juxing && x==((juxing)i).x && y==((juxing)i).y && this.p.equals(((juxing)i).p);
}
public String toString() 
{
	return String.format("������ʼ����:(%d,%d) ��:%.2f ��:%.2f �ܳ�Ϊ:%.2f ���Ϊ:%.2f",p.x,p.y,x,y,zhouchang(),mianji());
}
}
