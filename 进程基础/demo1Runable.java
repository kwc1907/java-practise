package two;

public class demo1Runable {
    public static void main(String[] args) {
        myrunable my=new myrunable();
        new Thread(my).start();
        for(int i=0;i<20;i++)
        {
            System.out.println(Thread.currentThread().getName()+"："+i);
        }
    }
}
