package lianxi;

public class output extends Thread{
       @Override
    public void run(){
           while(true){
           for (int i=0;i<=5;i++)
       {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
               System.out.println("到5秒钟了");}}


}
