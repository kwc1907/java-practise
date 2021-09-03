package fivefuxi;

import java.util.*;

public class baozipu implements Runnable {
    private ArrayList<baozi> b;
    Object o;
    public baozipu(ArrayList<baozi> b,Object o){this.b=b;this.o=o;}

    @Override
    public void run() {
        while(true) {
            synchronized (o) {
                if (b.size() > 4) {
                    o.notifyAll();
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("我开始做包子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                b.add(new baozi());
                System.out.println("做好一个包子，当前包子数量:"+b.size());
            }
        }
    }
}
