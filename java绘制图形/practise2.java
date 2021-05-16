package javaÉÏ»ú2;
import java.io.*;
import java.util.*;
class point2D
{
	point2D(){}
	point2D(int x,int y){this.x=x;this.y=y;}
	int x;int y;
	public boolean equals(Object i)
	{
		return i instanceof point2D && x==((point2D)i).x && y==((point2D)i).y;
		
	}
}
class manager
{
ArrayList<GeometricaObject>	a=new ArrayList<GeometricaObject>();
void add(GeometricaObject i)
{
	a.add(i);
}
void remove(GeometricaObject i)
{
a.remove(i);	
}
}
public class practise2 {
	public static void main(String[] args) throws IOException {
		manager a=new manager();
		Random rand=new Random();
		for(int i=0;i<10;i++)
		{
			int t=rand.nextInt(3);
			switch(t)
			{
			case 0:a.add(new yuan(50*rand.nextDouble(),rand.nextInt(600),rand.nextInt(400)));break;
			case 1:a.add(new juxing(100*rand.nextDouble(),100*rand.nextDouble(),rand.nextInt(600),rand.nextInt(400)));break;
			case 2:int o=rand.nextInt(5)+1;duobian d=new duobian();
			for(int j=1;j<=o;j++) 
			{
			while(true)
			{try
			{
				d.set(new duo(rand.nextInt(600),rand.nextInt(400)));
				break;
			}catch(duobianexce e)
			{}
			}
			}
			a.add(d);break;
			}
		}
		HashMap<String,ArrayList<GeometricaObject>> b=new HashMap<String,ArrayList<GeometricaObject>>();
		b.put("circle",new ArrayList<GeometricaObject>());
		b.put("juxing",new ArrayList<GeometricaObject>());
		b.put("duobian",new ArrayList<GeometricaObject>());
		for(int i=0;i<10;i++)
		{
			if(a.a.get(i) instanceof yuan)
			{
				b.get("circle").add(a.a.get(i));
			}
			else if(a.a.get(i) instanceof juxing)
			{
				b.get("juxing").add(a.a.get(i));
			}
			else
				b.get("duobian").add(a.a.get(i));
		}
		Collections.sort(b.get("circle"));
		Collections.sort(b.get("juxing"));
		Collections.sort(b.get("duobian"));
		for(String i:b.keySet())
		{
			FileWriter f=new FileWriter("D:\\"+i+".txt");
			for(GeometricaObject j:b.get(i))
			{
				f.write(j.toString()+"\n");
			}
			f.close();
		}
		FileReader f=new FileReader("D:\\juxing.txt");
		char[] g=new char[1024];
		int l;
		while((l=f.read(g))!=-1)
		{
			System.out.println(new String(g,0,l));
		}
		f.close();
		new jframe(a);
	}
}
