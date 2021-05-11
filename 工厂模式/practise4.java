package javaÉÏ»ú4;
import java.util.*;
public class practise4 {
	public static void main(String[] args) {
		Integer[] a=new Integer[new Random().nextInt(16)+5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Random().nextInt(20)-10;
		}
		Integer[] b=a;
		Arrays.sort(b,new Comparator<Integer>()
				{public int compare(Integer x,Integer y)
				{
				int a=(int) Math.pow(x,2);
				int b=(int)Math.pow(y,2);
				return a>b ? -1 :(a==b ? 0:1);
				}
				});
		System.out.println(Arrays.toString(b));
	}

}
