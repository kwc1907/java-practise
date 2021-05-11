package java上机1;
import java.util.*;
public class practise1 {
    public static void main(String args[]) {
        cout();
        System.out.print("请分别输入一个浮点数和一个小数以计算二者之和：" + "\n");
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
        System.out.print("请输入一个1~10之间的整型数字以计算其阶乘值：");
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
        	System.out.println("您输入的数字不在1~10之间，请重新输入:");
        }
        }
        for(int i = 1; i <= a; i++)
        {
            sum *= i;
        }
        System.out.print("该数阶乘结果为：" + sum + "\n");
        int exe = 1;
        System.out.println("输入所要计算的次方：");
        int x = input1.nextInt();
        for(int j = 0; j < x; j++)
        {
            exe *= a;
        }
        System.out.println(a + "的" + x +"次方为:" + exe );
    }
    public static void BMI()
    {
        Scanner index = new Scanner(System.in);
        System.out.println("请输入您的体重（kg）：");
        double weight = index.nextDouble();
        System.out.println("请输入您的身高（m）：");
        double height = index.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("您的BMI指数为：" + BMI);
        if(BMI < 18.5)
        {
            System.out.println("过轻");
        }
        if(BMI >= 18.5 && BMI < 24)
        {
            System.out.println("正常");
        }
        if(BMI >= 24 && BMI <35)
        {
            System.out.println("过重");
        }
        if(BMI >=35)
        {
            System.out.println("重度肥胖");
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

