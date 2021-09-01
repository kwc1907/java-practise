package threeFile;

import java.io.File;

public class file_basic {
    public static void main(String[] args) {
        System.out.println(File.pathSeparator); //路径分隔符 windows:;   Linux: :
        System.out.println(File.separator);   //文件分隔符  windows:\   Linux:/
        File f1=new File("C:\\Users\\若久\\Desktop\\随缘记事本\\Java.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println(f1.length());
        File f2=new File("C:\\Users\\若久\\Desktop\\随缘记事本");
        String[] a=f2.list();   //获取目录中文件的名字
        for(String i:a)
        {
            System.out.println(i);
        }
    }
}
