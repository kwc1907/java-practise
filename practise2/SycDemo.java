package javaExam;

public class SycDemo{

    private static Object lock = new Object();

    private static String weather = "sunny";

    public static void main(String[] args) {

        new Thread(()->{
            synchronized (lock){
                System.out.println("t1 before change weather is :" + weather);
                weather = "raing";
                System.out.println("t1 after change weather is :" + weather);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t1").start();

        new Thread(()->{
            synchronized (lock){
                System.out.println("t2 before change weather is :" + weather);
                weather = "snow";
                System.out.println("t2 after change weather is :" + weather);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t2").start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
            System.out.println("main thread weather is:" +weather);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
