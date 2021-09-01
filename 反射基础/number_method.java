package fourfanshe;

import java.lang.reflect.Method;

public class number_method {
    public static void main(String[] args) throws Exception {
        Class p=person.class;
        Method m=p.getMethod("eat",String.class);
        person o=new person();
        m.invoke(o,"adad");
        Method[] methods=p.getMethods();
        for(Method i:methods)
            System.out.println(i);
    }
}
