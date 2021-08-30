package two;

public class test_sale2 {
    public static void main(String[] args) {
        sale_tacket2 a=new sale_tacket2();
        new Thread(a).start();
        new Thread(a).start();
        new Thread(a).start();

    }
}
