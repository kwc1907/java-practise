package two;

public class demo2Runable {
    public static void main(String[] args) {
        int a=5;
        new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<10;i++)
                    System.out.println(Thread.currentThread().getName()+":"+a);
            }
        }).start();
        for(int i=0;i<10;i++)
            System.out.println(Thread.currentThread().getName()+":"+a);
    }
}
