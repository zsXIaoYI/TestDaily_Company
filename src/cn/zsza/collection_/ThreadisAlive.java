package cn.zsza.collection_;

/**
 * Created by user on 2016/2/22.
 */
class MyThreadSource extends Thread{
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
public class ThreadisAlive {
    public static void main(String[] args) throws InterruptedException {
        MyThreadSource my = new MyThreadSource();
        System.out.println("begin == " + my.isAlive());
        my.start();
        Thread.sleep(1000);
        System.out.println("end == " + my.isAlive());
    }
}
