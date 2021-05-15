package Á·Ï°;

import static Á·Ï°.Print.println;
public class ·ºÐÍ¶ÑÕ» <T>{
	private static class node<U>
	{
		U data;
		node<U> next;
		node(){data=null;next=null;}
		node(U d,node<U> n){data=d;next=n;}
		boolean end() {return data==null&&next==null;}
	}
	node<T> top=new node<T>();
	public void push(T a)
	{
		top=new node<T>(a,top);
	}
	public T pop()
	{
		T r=top.data;
		if(!top.end())
			top=top.next;
		return r;
	}
	public static void main(String args[]) throws Exception{
		·ºÐÍ¶ÑÕ»<String> a=new ·ºÐÍ¶ÑÕ»<String>();
	  for(String i:"ni m s q w e r".split(" "))
		  a.push(i);
	  String s;
	  while((s=a.pop())!=null)
		  println(s);
}
}
