package java�ϻ�2;
import java.util.*;
class MyStopWatch extends TimerTask
{
private int startTime=-1;
private int stopTime=-1;
private int runningState=0;
private int splitState=5;
public static int i=1;
public void start()
{
	runningState=1;
}
public void stop()
{
	runningState=2;
}
public void suspend()
{
	runningState=3;
}
public void resume()
{
	runningState=1;
}
public void split()
{
	 splitState=4;
}
public void unsplit()
{
	 splitState=5;
}
public void run() 
{
	i++;
	System.out.println("�����ǵ�"+i+"��");
}
}
public class practise1 {
public static void display()
	{
		System.out.println("1.��ʼ");
		System.out.println("2.ֹͣ");
		System.out.println("3.��ͣ");
		System.out.println("4.�ֶ�");
		System.out.println("5.ֹͣ�ֶ�");
	}
public static void main(String[] args) 
{
	MyStopWatch S1=new MyStopWatch();
	Scanner sc=new Scanner(System.in);
	display();
	for(int i=0;i<10;i++)
	{
		int a=sc.nextInt();
		if(a==1)
		{
			Timer timer = new Timer();
			timer.scheduleAtFixedRate(new MyStopWatch(),1000,1000);
			int b=sc.nextInt();
			if(b==3)
			{
				timer.cancel();
			}
			if(b==2)
			{
				timer.cancel();
				break;
			}
			if(b==4)
			{
				System.out.println("�ֶ���"+S1.i+"��");
			}
		}
	}
	 
}
}

