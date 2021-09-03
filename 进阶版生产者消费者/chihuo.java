package fivefuxi;

import java.util.ArrayList;

public class chihuo implements Runnable{

    Object o;
    private ArrayList<baozi> b;
    public chihuo(ArrayList<baozi> b,Object o){this.o=o;this.b=b;}

    @Override
    public void run() {
        while(true)
        {
            synchronized (o)
            {
                if(b.size()==0)
                {
                    o.notify();
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    continue;
                }
                System.out.println(Thread.currentThread().getName()+"开始吃包子");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                b.remove(b.size()-1);
                System.out.println(Thread.currentThread().getName()+"已吃完包子,当前包子铺内剩余:"+b.size());
            }
        }
    }
}
