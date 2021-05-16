package java上机2;

class juxingexce extends Exception
{
public void jiejue()
{
	System.out.println("矩形的长和宽不能是负数");
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
	return String.format("矩形起始坐标:(%d,%d) 长:%.2f 宽:%.2f 周长为:%.2f 面积为:%.2f",p.x,p.y,x,y,zhouchang(),mianji());
}
}
