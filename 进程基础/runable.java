package two;

public class runable  implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
