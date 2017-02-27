package cn.zsza.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangsong on 2016/4/6.
 */
class MyRunnable2 implements Runnable{
    int k = 5;
    @Override
    public void run() {
        try {
            System.out.println("...." + Thread.currentThread().getName() + "...."+k--);
//            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class ThreadPoolTest {
    public static void main(String[] args) {
        MyRunnable2 my2 = new MyRunnable2();
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            threadPool.execute(my2);
        }
        threadPool.shutdown();
    }
}
