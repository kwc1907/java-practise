package lianxi;

import java.util.Scanner;

public class shiyan {
    public static void main(String[] args) {
        output a=new output();
        a.start();
        Scanner b=new Scanner(System.in);
        System.out.println("请在五秒内输入内容:");
        String s=b.nextLine();
        System.out.println(s);
    }
}
