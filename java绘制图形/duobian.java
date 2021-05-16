package java上机2;
import java.util.*;
class duo
{
duo(){}
duo(int x,int y){this.x=x;this.y=y;}
int x;
int y;
public boolean equals(Object i)
{
	return i instanceof duo && x==((duo)i).x && y==((duo)i).y;
}
}
class duobianexce extends Exception
{
	public void jiejue()
	{
	System.out.println("这个顶点重复了，请重新输入:");
	}
}
public class duobian extends GeometricaObject
{
	ArrayList<duo> a=new ArrayList<duo>();
	void set(duo i) throws duobianexce
	{
		if(a.contains(i))
		{
			throw new duobianexce();
		}
		else a.add(i);
	}
	double zhouchang() {
		double sum=0;
		for(int i=0;i<a.size()-1;i++)
		{
			double m=a.get(i+1).x-a.get(i).x;
			double n=a.get(i+1).y-a.get(i).y;
			double c=Math.pow(m,2)+Math.pow(n,2);
			sum+=Math.sqrt(c);
		}
		return sum;
	}
	double mianji() {
		return 0;
	}
	public boolean equals(Object i)
	{
		return i instanceof duobian && a.equals(((duobian)i).a);
	}
	public String toString() {
		StringBuilder t=new StringBuilder();
		t.append("多边形坐标为:");
		for(duo i:a)
		{
			t.append("("+i.x+","+i.y+")  ");
		}
		t.append(String.format("周长为:%.2f ",zhouchang()));
		return t.toString();
	}
}