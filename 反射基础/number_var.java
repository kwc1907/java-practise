package fourfanshe;

import java.lang.reflect.Field;

public class number_var {
    public static void main(String[] args) throws Exception {
        Class p=person.class;
        Field[] fields=p.getFields();
        for(Field i:fields)
            System.out.println(i);
        Field n=p.getField("name");
        person o=new person("小红",14);
        System.out.println(n.get(o));
        n.set(o,"nihao");
        System.out.println(o);
        System.out.println("----------------------------------");
        Field[] fields1=p.getDeclaredFields();
        for(Field i:fields1)
            System.out.println(i);
        Field y=p.getDeclaredField("age");
        y.setAccessible(true);
        System.out.println(y.get(o));
        y.set(o,58);
        System.out.println(o);
    }
}
