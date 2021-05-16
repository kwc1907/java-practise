package java大作业;
import java.io.*;
import java.util.*;
public class StudentLogin {
    Scanner sc = new Scanner(System.in);     //获取控制台输入
    Vector<Student> v = new Vector<Student>();           //创建一个动态数组的对象
    private Student atm;  
    //current是Account的对象，是Account类的实例化
    public StudentLogin() {
        try {     //异常捕获
            FileInputStream fi = new FileInputStream("D:\\account.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            v = (Vector<Student>) oi.readObject();
        } catch (FileNotFoundException e) {
            v.add(new Student("admin", "1", 100));  
            v.add(new Student("user", "2", 100));
            v.add(new Student("windy", "3", 100));
            v.add(new Student("jason", "4", 100));
        } catch (Exception e) {
            System.out.println("Error - " + e.toString());
        }
    }
    public boolean check(String account, String pw) {     //检查账号，密码是否正确
        int i;    //定义了一个整型变量
        Student a;     
        for (i = 0; i < v.size(); i++) {
            a = v.get(i);
            if (a.check(account, pw)) {
                atm = a;
                return true;
            }
        }
       atm = null;
        return false;
    }
    public void saveData() {      //保存数据
        try {
            FileOutputStream fo = new FileOutputStream("D:\\account.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(v);
            oo.close();
        } catch (IOException e) {
            System.out.println("Error -" + e.toString());
        }
 
    }
}
