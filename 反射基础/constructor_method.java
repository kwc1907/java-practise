package fourfanshe;

import java.lang.reflect.Constructor;

public class constructor_method {
    public static void main(String[] args) throws Exception {
        Class p=person.class;
        Constructor c=p.getConstructor(String.class,int.class);
        System.out.println(c);
        Object o=c.newInstance("张三",14);
        System.out.println(o);
         Constructor c1=p.getConstructor();
         Object o1=c1.newInstance();
        System.out.println(o1);
        Object o2=p.newInstance();
        System.out.println(o2);
    }
}
