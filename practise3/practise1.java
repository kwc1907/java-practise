package java上机3;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;
interface jisuan
{
double suanshu(); 	
}
class yingyuan implements jisuan
{
	Map<String,Integer> a=new HashMap<String,Integer>();
	private int i;
	String s;
	yingyuan(String t,int i,String s)
	{
		if(t=="会员")
		{
			a.put("2D",25);a.put("3D",30);a.put("VIP",50);
		}
		else 
		{
			a.put("2D",50);a.put("3D",60);a.put("VIP",100);
		}
		this.i=i;this.s=s;
	}
	public double suanshu()
	{
		return i*a.get(s);
	}
}
class chuzuche implements jisuan
{
	int i;
	chuzuche(double i)
	{this.i=(int)i+1;}
public double suanshu()
{
 if(i<=3)
	 return 8;
 else 
	 return 8+(i-3)*0.8;
}
}
class tingche implements jisuan
{
	String s;
	int i;
tingche(String s,int i)
{
this.s=s;this.i=i;	
}
public double suanshu()
{
	if(s=="晚上")
		return i*10;
	else
		return i*4;
}
}
public class practise1 implements Readable{
public static void print(jisuan a)
{
	System.out.println(a.suanshu());
}	
public int read(CharBuffer cb) throws IOException {
		cb.append("会员");
		Integer a=new Integer(5);
		cb.append(a.toString());
		cb.append("2D");
		cb.append(" ");
		return 0;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(new practise1());
		System.out.println(sc.next());
		yingyuan a=new yingyuan("",2,"VIP");
		print(a);
		chuzuche b=new chuzuche(3);
		print(b);
		tingche c=new tingche("晚上",5);
		print(c);
	}

	

}
