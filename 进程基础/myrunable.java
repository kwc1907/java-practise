package two;

public class myrunable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<20;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {

    }
}
