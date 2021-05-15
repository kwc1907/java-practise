package Á·Ï°;
import java.util.*;
public class sets {
	public static <T> Set<T> union(Set<T> a,Set<T> b)
	{
		Set<T> r=new HashSet<T>(a);
		r.addAll(b);
		return r;
	}
	public static <T> Set<T> cha(Set<T> a,Set<T> b)
	{
		Set<T> r=new HashSet<T>(a);
		r.removeAll(b);
		return r;
	}
	public static <T> Set<T> jiao(Set<T> a,Set<T> b)
	{
		Set<T> r=new HashSet<T>(a);
		r.retainAll(b);
		return r;
	}
	public static void main(String[] args)
	{
		sets a=new sets();
		Set<Integer> b=new HashSet<Integer>();
		b.add(14);
		b.add(124);
		b.add(2543);
		b.add(243);
		b.add(87);
		Set<Integer> c =new HashSet<Integer>(b);
		c.remove(124);
		c.remove(2543);
		Set<Integer> d=new HashSet<Integer>(cha(b,c));
		for(int i:d)
			System.out.println(i);
	}

}
