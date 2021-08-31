package two;

public class demo1Wait_Notify {
    public static void main(String[] args) {
        Object o=new Object();
        new Thread(){
          @Override
          public void run()
          {
              synchronized (o)
              {
                  System.out.println("顾客一包子数量与种类");
                  try {
                      o.wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println("顾客一开吃");
              }
          }
        }.start();
        new Thread(){
            @Override
            public void run()
            {
                synchronized (o)
                {
                    System.out.println("顾客二包子数量与种类");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("顾客二开吃");
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                while (true)
                {try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                synchronized (o)
                {
                    System.out.println("包子做好了，可以吃了");
                    o.notify();
                }}
            }
        }.start();
    }
}
