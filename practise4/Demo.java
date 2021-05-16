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
return "编号:"+id+"  品牌："+brand+"  尺寸："+size+"  价格："+price;
}

}
public class Demo {
	public static String name="计算机1804";
	public static void test()
	{
		System.out.println("类名字:"+new Phone180405406().getClass().getSimpleName()+"  name:"+Demo.name);
	}
	public static void main(String[] args) {
			ArrayList<Phone180405406> a=new ArrayList<Phone180405406>();
			a.add(new Phone180405406(1,"华为","15*15",3600));
			a.add(new Phone180405406(2,"苹果","14*13",4100));
			a.add(new Phone180405406(3,"华为","17*18",5600));
			a.add(new Phone180405406(4,"vivo","17*18",2800));
			a.add(new Phone180405406(5,"苹果","15*19",8888));
			HashMap<String,ArrayList<Phone180405406>> f=new HashMap<String,ArrayList<Phone180405406>>();
			f.put("华为",new ArrayList<Phone180405406>());
			f.put("苹果",new ArrayList<Phone180405406>());
			f.put("vivo",new ArrayList<Phone180405406>());
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i).getbrand()=="华为")
				{
					f.get("华为").add(a.get(i));
				}
				else if(a.get(i).getbrand()=="苹果")
				{
					f.get("苹果").add(a.get(i));
				}
				else
				{
					f.get("vivo").add(a.get(i));
				}
			}
			Collections.sort(f.get("华为"));
			Collections.sort(f.get("苹果"));
			Collections.sort(f.get("vivo"));
			System.out.println("分类结果及分类后的排序:");
			System.out.println("华为：");
			for(Phone180405406 i:f.get("华为"))
			System.out.println(i);
			System.out.println("苹果：");
			for(Phone180405406 i:f.get("苹果"))
			System.out.println(i);
			System.out.println("vivo：");
			for(Phone180405406 i:f.get("vivo"))
			System.out.println(i);
			test();
			
	}

}
