package java上机2;

class sanjiaoexce extends Exception
{
	public void jiejue()
	{
		System.out.println("您输入的三边无法构成三角形");
		printStackTrace();
		System.exit(0);
	}
}
public class sanjiao extends GeometricaObject
{
private double x;
private double y;
private double z;
sanjiao(double x,double y,double z)
{
try
{
if(x+y<=z||x+z<=y||y+z<=x||Math.abs(x-y)>=z||Math.abs(x-z)>=y||Math.abs(y-z)>=x)
{
	throw new sanjiaoexce();
}}catch(sanjiaoexce e)
{
	e.jiejue();
}
this.x=x;this.y=y;this.z=z;	
}
public double zhouchang()
{
	return x+y+z;
}
public double mianji()
{
	double p=(x+y+z)/2;
	return Math.sqrt(p*(p-x)*(p-y)*(p-z));
}
public String toString() 
{
	return String.format("三角形   周长为:%.2f 面积为:%.2f",zhouchang(),mianji());
}
}