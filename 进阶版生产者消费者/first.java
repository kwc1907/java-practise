package fivefuxi;


import java.util.ArrayList;

public class first {
    public static void main(String[] args) {
        ArrayList<baozi> a = new ArrayList<baozi>();
        Object o=new Object();
        new Thread(new baozipu(a,o)).start();
        new Thread(new chihuo(a,o)).start();
        new Thread(new chihuo(a,o)).start();
        new Thread(new chihuo(a,o)).start();

    }


}
