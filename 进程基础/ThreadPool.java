package two;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService e= Executors.newFixedThreadPool(2);  //生产一个指定数量的线程池
        e.submit(new runable());   //传递线程任务     执行完任务自动归还线程
    }
}
