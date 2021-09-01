package fourfanshe;

public class fanshe_basic {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1=Class.forName("fourfanshe.person");
        System.out.println(c1);
        Class c2=person.class;
        System.out.println(c2);
        person p=new person();
        Class c3=p.getClass();
        System.out.println(c3);
    }
}
