package two;

public class chihuo  extends Thread{
    private baozi bz;
    public chihuo(baozi bz){this.bz=bz;}
    @Override
    public void run()
    {
        while (true)
        {
            synchronized (bz)
            {
                if(bz.flag==false)
                {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("顾客正在吃"+bz.pi+bz.xian+"的包子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("顾客已吃完包子");
                bz.flag=false;
                bz.notify();
                System.out.println("-------------------------------------");
            }
        }
    }
}
