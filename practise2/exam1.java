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
	return "ѧ��������"+sname+"\tѧ��:"+sno+"\tרҵ:"+smajor;
}
}
class sm
{
ArrayList<student> a=new ArrayList<student>();
public void adds(student s)
{
	if(a.contains(s))
	{
		System.out.println("ѧ���ظ����޷����");
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
b.put("�����",new ArrayList<student>());	
b.put("����",new ArrayList<student>());	
b.put("���",new ArrayList<student>());	
}
public void put(sm man)
{
for(int i=0;i<man.a.size();i++)
{if(man.a.get(i).smajor=="�����")
	b.get("�����").add(man.a.get(i));
if(man.a.get(i).smajor=="���")
	b.get("���").add(man.a.get(i));
if(man.a.get(i).smajor=="����")
	b.get("����").add(man.a.get(i));
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
		man.adds(new student("��ҵ�Ƽ�",4081,"�����"));
		man.adds(new student("�������",4014,"�����"));
		man.adds(new student("��������",4063,"���"));
		man.adds(new student("��ͦ��",4014,"����"));
		man.adds(new student("��������",4005,"����"));
		tools to=new tools();
		to.put(man);
		to.sort();
		to.bianli();
	}
}

