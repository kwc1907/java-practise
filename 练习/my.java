package ��ϰ;
import java.util.*;
import java.net.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;

import static ��ϰ.Print.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.math.*;
import java.text.*;
class lianxi1 implements Comparable<lianxi1>,Serializable,Cloneable
{
	lianxi1() {i=0;}
	private int i;
	lianxi1(int i){this.i=i;}
	void print1() {println(i);}
	public boolean equals(Object o)
	{
		return o instanceof lianxi1 && ((lianxi1)o).i==i;
	}
	public int compareTo(lianxi1 a)
	{
		return i<a.i ? -1 :(i==a.i ? 0:1);
	}
	public int hashCode()
	{
		int result=17;
		result=37*17+i;
		return result;
	}
	public Object clone()
	{
		lianxi1 lenshi=new lianxi1(this.i);
		return lenshi;
	}
	public String toString()
	{return i+"";}
	
	
}
class qwe<T>
{
T a;

}
class asd implements Comparable<asd>
{
	int t;
	String a;
	asd(){}
	asd(int a){t=a;}
	public boolean equals(Object o)
	{
		return o instanceof asd && (a==((asd)o).a);
	}
	public int compareTo(asd q)
	{
		return 0;
	}
	/*public int hashCode()
	{
		return t;
	}*/
	public String toString()
	{
		return t+" ";
	}
}
class basic implements Comparable<basic>
{
	int i;
	String name;
	basic(){i=0;name=null;}
	basic(int i,String n){this.i=i;name=n;}
	public boolean equals(Object o)
	{
		return o instanceof basic && ((basic)o).i==i && ((basic)o).name==name;
	}
	public int compareTo(basic b)
	{
		return name.compareTo(b.name);
	}
	public String toString()
	{return i+":"+name;}
}
class qwe1 extends Exception
{
	int r;
	qwe1(int r){super("qwe1:"+r);this.r=r;}
	public int jiejue()
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		return l;
	}
}
class mm implements Comparable<mm>
{
int t;
mm(){}
mm(int y){t=y;}
public String toString()
{
return t+"";
}
public boolean equals(Object o)
{
	return o instanceof mm && ((mm)o).t==t;
}
public int hashCode()
{
int r=17;
r=r*37+t;
return r;
}
public int compareTo(mm o)
{
return t<o.t?-1:(t==o.t? 0:1);	
}
}
class qqq implements Runnable
{
	int count=10;
	public void run()
	{
		while(count!=0)
		println("qqq:"+count--);
	}
}
class qq implements Runnable
{
	 int count=10;
	public void run()
	{
		while(count>0)
		{
		synchronized(this)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+count);
			count--;
		}
		}
	}
}
public class my {
	public static void main(String[] args) throws UnknownHostException, MalformedURLException, InterruptedException
	{
		Boolean a=new Boolean(true);
		Boolean b=new Boolean("true");
		println(a.equals(b));
	}
}


























/*
 �����Ķ�������
 �����ԱĬ�ϳ�ʼ�� String��null   char�� �� 
 javac����  javaִ��
 e����10����
 �Զ�����˳�� byte short int long float double                            char int
int[] a=new int[5];
	int[] b= {2,3};
	int[] c;
	c=new int[] {14,28,69,0};
�ɱ�����б�Object...args
�̳�һ���ȳ�ʼ�����࣬������û�д�����
java�еĶ�̳�
class fennv extends xiao implements f,g,s
�ӿ�֮�����ֱ�Ӷ�̳�
interface f    interface g
interface m extends f,g
�ӿ��е������ǿ�final���������Ƿǳ������ʽ
�ڲ��ഴ��  con=a.new con();
Ƕ���ഴ�� con=new con();
������ new con(){}; 
�쳣��finally������ζ��ᱻִ�У�����try����breakҲ������ִ��finally�г���Ȼ����ִ��break
printStackTrace()
Throwable��Ϊ���ࣺError��Exception
�������鱣���������
����6����Arrays.toString  Arrays.fill   Arrays.sort  Arrays.binarySearch  Arrays.asList  Arrays.equals 
int[][] a=new int[3][]; a[i]=new int[]{14,25,3,6};  ��ά����ֻ��̶��������������⡣

List����������get indexOf add addAll remove set contains clear lastIndexOf size
public int hashCode()
{
int result=17;
result=reault*37+i;
return result;
}
map:put get containsKey containsValue keySet values 
Collections sort shuffle reverse swap fill nCopies rotate
�ļ��ֽ�����FileInputStream a    byte[] b   int i=a.read(b)   println(new String(b,1,i)) 
FileOutputStream b b.write(new String("csdf").getBytes());
�ַ�:FileReader char[]   int l=a.read(c) new String(c,0,l);     while((l=a.read(c))!=-1)
FileWriter    a.write("csdvf");  a.flush();
String����:repalceAll replaceFirst split ������ʽ�� ͨ������ʹ��ʱ�ã���������  
������ʽ����  Pattern p=Pattern.compile(regext);
Matcher m=p.matcher(a)    m.find()   m.group  m.reset
String.format("%d %f",a,b) ��ʽ������String����   System.out.format("%d %f",a,b) 
Formatter f=new Formatter(System.out) f.format("%d %f",a,b)
��ȡclass����ķ���:1.Class c=null  c=Class.forName("ȫ�޶���������������")                    
 c.getName    getSimpleName  isInterface getInterfaces->for(Class i:c.getInterfaces)println(i)  getSuperclass newInstance
 Class c=lianxi1.class    ����lianxi1.class����������ʼ�� ��forName���ʼ��
 Class c=new lianxi1().getClass()      isInstance��class�õ�
 ���ͷ���  public static <T> void show(T x){println(x);}
 ���͵�ʵ���ǲ�����List<T>������ΪList  ��ͨ���ͱ�����ΪObject   �б߽���򱻲������߽�   ��:<T extends Hash> ��T������ΪHash
 */