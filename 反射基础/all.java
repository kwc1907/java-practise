package fourfanshe;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class all {
    public static void main(String[] args) throws Exception {
        Properties pro=new Properties();
        ClassLoader classLoader=all.class.getClassLoader();
        InputStream in=classLoader.getResourceAsStream("pro.properties");
        pro.load(in);
        String className=pro.getProperty("className");
        String methodName=pro.getProperty("methodName");
        Class a=Class.forName(className);
        Object o=a.newInstance();
        Method m=a.getMethod(methodName);
        m.invoke(o);
    }
}
