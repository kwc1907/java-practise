package exam;
import java.util.*;
class Phone180405406 implements Comparable<Phone180405406>
{
private int id;
private String brand;
private String size;
private double price;
Phone180405406()
{
id=0;brand=null;size=null;price=0;	
}
Phone180405406(int i,String b,String s,double p)
{
id=i;brand=b;size=s;price=p;	
}
public int compareTo(Phone180405406 t)
{
	return price<t.price ?-1:(price==t.price ?0:1);
}
public String getbrand()
{
return brand;	
}
public String toString()
{
return "���:"+id+"  Ʒ�ƣ�"+brand+"  �ߴ磺"+size+"  �۸�"+price;
}

}
public class Demo {
	public static String name="�����1804";
	public static void test()
	{
		System.out.println("������:"+new Phone180405406().getClass().getSimpleName()+"  name:"+Demo.name);
	}
	public static void main(String[] args) {
			ArrayList<Phone180405406> a=new ArrayList<Phone180405406>();
			a.add(new Phone180405406(1,"��Ϊ","15*15",3600));
			a.add(new Phone180405406(2,"ƻ��","14*13",4100));
			a.add(new Phone180405406(3,"��Ϊ","17*18",5600));
			a.add(new Phone180405406(4,"vivo","17*18",2800));
			a.add(new Phone180405406(5,"ƻ��","15*19",8888));
			HashMap<String,ArrayList<Phone180405406>> f=new HashMap<String,ArrayList<Phone180405406>>();
			f.put("��Ϊ",new ArrayList<Phone180405406>());
			f.put("ƻ��",new ArrayList<Phone180405406>());
			f.put("vivo",new ArrayList<Phone180405406>());
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i).getbrand()=="��Ϊ")
				{
					f.get("��Ϊ").add(a.get(i));
				}
				else if(a.get(i).getbrand()=="ƻ��")
				{
					f.get("ƻ��").add(a.get(i));
				}
				else
				{
					f.get("vivo").add(a.get(i));
				}
			}
			Collections.sort(f.get("��Ϊ"));
			Collections.sort(f.get("ƻ��"));
			Collections.sort(f.get("vivo"));
			System.out.println("������������������:");
			System.out.println("��Ϊ��");
			for(Phone180405406 i:f.get("��Ϊ"))
			System.out.println(i);
			System.out.println("ƻ����");
			for(Phone180405406 i:f.get("ƻ��"))
			System.out.println(i);
			System.out.println("vivo��");
			for(Phone180405406 i:f.get("vivo"))
			System.out.println(i);
			test();
			
	}

}
