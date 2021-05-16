package javaÉÏ»ú2;

public abstract class GeometricaObject implements Comparable<GeometricaObject>
{
	point2D p;
	abstract double zhouchang();
	abstract double mianji();
	abstract public String toString();
	public int compareTo(GeometricaObject i)
	{
		return zhouchang()<i.zhouchang() ?-1:(zhouchang()==i.zhouchang() ? 0:1);
	}
}
