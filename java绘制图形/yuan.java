package java上机2;
import java.util.Scanner;
class yuanexce extends Exception
{
	double r;
	yuanexce(){}
	yuanexce(double r)
	{
		this.r=r;
	}
	public void jiejue()
	{
		System.out.println("圆当前半径为"+r+" 小于0,不符合要求，请重新输入:");
	}
	public double get()
	{
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		return r;
	}
}
public class yuan extends GeometricaObject 
{
private double r;
yuan(double r,int x,int y){
	while(true)
	{try
	{if(r<0)
	throw new yuanexce(r);
	else break;
	}catch(yuanexce e) 
	{
		e.jiejue();
		r=e.get();
	}
	}
	this.r=r;
	p=new point2D(x,y);
}
public double zhouchang()
{
	return 2*Math.PI*r;
}
public double mianji()
{
	return Math.PI*r*r;
}
public double get()
{
return r;	
}
public boolean equals(Object i)
{
	return i instanceof yuan && r==((yuan)i).r && this.p.equals(((yuan)i).p);
}
public String toString() 
{
	return String.format("圆心位置:(%d,%d) 半径:%.2f 周长为:%.2f 面积为:%.2f",p.x,p.y,r,zhouchang(),mianji());
}
}
