package two;

public class baozitest {
    public static void main(String[] args) {
        baozi bz=new baozi();
        new baozipu(bz).start();
        new chihuo(bz).start();
    }

}
