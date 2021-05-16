package javaExam;
import java.util.*;
class student implements Comparable<student>
{
String sname;
int sno;
String smajor;
student(String s,int sn,String sm){sname=s;sno=sn;smajor=sm;}
public boolean equals(Object o)
{
	return o instanceof student && ((student)o).sno==sno;
}
public int hashCode()
{
int r=17;
r=37*17+sname.hashCode()+sno+smajor.hashCode();
return r;
}
public int compareTo(student o)
{
return sno<o.sno? -1:(sno==o.sno? 0:1);	
}
public String toString()
{
	return "学生姓名："+sname+"\t学号:"+sno+"\t专业:"+smajor;
}
}
class sm
{
ArrayList<student> a=new ArrayList<student>();
public void adds(student s)
{
	if(a.contains(s))
	{
		System.out.println("学号重复，无法添加");
	}
	else a.add(s);
	
}
public void removes(student s)
{
	if(a.contains(s))
		a.remove(s);
}
}
class tools
{
HashMap<String,ArrayList<student>> b=new HashMap<String,ArrayList<student>>();
tools()
{
b.put("计算机",new ArrayList<student>());	
b.put("智能",new ArrayList<student>());	
b.put("软件",new ArrayList<student>());	
}
public void put(sm man)
{
for(int i=0;i<man.a.size();i++)
{if(man.a.get(i).smajor=="计算机")
	b.get("计算机").add(man.a.get(i));
if(man.a.get(i).smajor=="软件")
	b.get("软件").add(man.a.get(i));
if(man.a.get(i).smajor=="智能")
	b.get("智能").add(man.a.get(i));
}	
}
public void sort()
{
	for(String i:b.keySet())
	{
		Collections.sort(b.get(i));
	}
}
public void bianli()
{
for(String i:b.keySet())
{
	System.out.println(i+":");
for(student k: b.get(i))
{
	System.out.println(k);	
}
}
}
}
public class exam1{
	public static void main(String[] args)
	{
		sm man=new sm();
		man.adds(new student("就业推荐",4081,"计算机"));
		man.adds(new student("个人体会",4014,"计算机"));
		man.adds(new student("二个好人",4063,"软件"));
		man.adds(new student("人挺好",4014,"智能"));
		man.adds(new student("教育体育",4005,"智能"));
		tools to=new tools();
		to.put(man);
		to.sort();
		to.bianli();
	}
}

