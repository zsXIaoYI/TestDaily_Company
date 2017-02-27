package cn.zsza.thread;

/**
 * Created by user on 2016/2/1.
 */
class MyThreadRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(Thread.currentThread().getName() + "-->"+ i);
        }
    }
}
public class MyRunnable  {
    public static void main(String[] args) {
        MyThreadRun my = new MyThreadRun();

        // 将线程对象作为构造参数传入
        Thread t1 = new Thread(my,"小一");
        Thread t2 = new Thread(my,"小二");

        t1.start();
        t2.start();
    }
}
