package Á·Ï°;

import static Á·Ï°.Print.println;

public class lianxi {
	lianxi() {i=0;}
	private int i;
	lianxi(int i){this.i=i;}
	void print1() {println(i);}
	public boolean equals(lianxi a)
	{
		return this.i==a.i;
	}
	public String toString()
	{return getClass().getName();}
}
