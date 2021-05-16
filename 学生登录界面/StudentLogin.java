package java����ҵ;
import java.io.*;
import java.util.*;
public class StudentLogin {
    Scanner sc = new Scanner(System.in);     //��ȡ����̨����
    Vector<Student> v = new Vector<Student>();           //����һ����̬����Ķ���
    private Student atm;  
    //current��Account�Ķ�����Account���ʵ����
    public StudentLogin() {
        try {     //�쳣����
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
    public boolean check(String account, String pw) {     //����˺ţ������Ƿ���ȷ
        int i;    //������һ�����ͱ���
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
    public void saveData() {      //��������
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
