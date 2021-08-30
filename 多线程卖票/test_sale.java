package two;

public class test_sale {
    public static void main(String[] args) {
        sale_tacket a=new sale_tacket();
        new Thread(a).start();
        new Thread(a).start();
        new Thread(a).start();

    }
}
