package two;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class sale_tacket2 implements Runnable{

    private int ticket=100;
    Lock l=new ReentrantLock();
    @Override
    public void run() {
        while(ticket>0) {
          l.lock();
          try{
          if(ticket>0)
          {System.out.println(Thread.currentThread().getName()+"卖第"+ticket+"张票");
          ticket--;}}
          finally {
              l.unlock();
          }

        }
    }
}
