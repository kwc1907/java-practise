package two;

public class test_sale1 {
    public static void main(String[] args) {
        sale_tacket1 a=new sale_tacket1();
        new Thread(a).start();
        new Thread(a).start();
        new Thread(a).start();

    }
}
