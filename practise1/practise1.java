package java�ϻ�1;
import java.util.*;
public class practise1 {
    public static void main(String args[]) {
        cout();
        System.out.print("��ֱ�����һ����������һ��С���Լ������֮�ͣ�" + "\n");
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        double y = input.nextDouble();
        plus(x, y);
        System.out.println();
        multiply1();
        BMI();
        compare();
    }

    public static void cout()
    {
        System.out.println("Hello, Java!");
    }

    public static void plus(float x, double y)
    {
        double sum = x + y;
        System.out.print(String.format("%.2f", sum));
    }

    public static void multiply1()
    {
        System.out.print("������һ��1~10֮������������Լ�����׳�ֵ��");
        Scanner input1 = new Scanner(System.in);
        int a;
        int sum = 1;
        while(true)
        {
        a= input1.nextInt();
        try 
        {
        if(a < 1 || a>10)
           throw new Exception();
        break;
        }catch(Exception e)
        {
        	System.out.println("����������ֲ���1~10֮�䣬����������:");
        }
        }
        for(int i = 1; i <= a; i++)
        {
            sum *= i;
        }
        System.out.print("�����׳˽��Ϊ��" + sum + "\n");
        int exe = 1;
        System.out.println("������Ҫ����Ĵη���");
        int x = input1.nextInt();
        for(int j = 0; j < x; j++)
        {
            exe *= a;
        }
        System.out.println(a + "��" + x +"�η�Ϊ:" + exe );
    }
    public static void BMI()
    {
        Scanner index = new Scanner(System.in);
        System.out.println("�������������أ�kg����");
        double weight = index.nextDouble();
        System.out.println("������������ߣ�m����");
        double height = index.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("����BMIָ��Ϊ��" + BMI);
        if(BMI < 18.5)
        {
            System.out.println("����");
        }
        if(BMI >= 18.5 && BMI < 24)
        {
            System.out.println("����");
        }
        if(BMI >= 24 && BMI <35)
        {
            System.out.println("����");
        }
        if(BMI >=35)
        {
            System.out.println("�ضȷ���");
        }
    }
    public static void compare()
    {
        System.out.println(new String("asd").equals(new String("asd")));
        System.out.println(new StringBuffer("asd").equals(new StringBuffer("asd")));
        System.out.println(new StringBuilder("asd").equals(new StringBuilder("asd")));
        String a = "nihao";
        String d = new String("nihao");
        System.out.println(d == a);
        System.out.println(a.equals(d));
    }
}

