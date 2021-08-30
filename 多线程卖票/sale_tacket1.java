package two;

public class sale_tacket1 implements Runnable{
    private int ticket=100;
    Object o=new Object();
    @Override
    public void run() {
        while(ticket>0) {
            method();
        }
    }
    //同步方法
    public synchronized void method(){
        if(ticket>0)
        {System.out.println(Thread.currentThread().getName()+"卖第"+ticket+"张票");
            ticket--;}
    }
}
