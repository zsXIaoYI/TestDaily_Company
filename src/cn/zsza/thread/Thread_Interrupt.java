package cn.zsza.thread;

import java.util.Date;

/**
 * Created by user on 2016/2/1.
 */
class Demo5 extends Thread{
    @Override
    public void run() {
        System.out.println("开始时间：" + new Date());
        try {
            Thread.sleep(5 * 1000);  // 休眠5秒
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("线程被中断了");
//            return;
        }

        System.out.println("结束时间："+ new Date());
    }
}
public class Thread_Interrupt {
    public static void main(String[] args) {
        Demo5 d5 = new Demo5();
        d5.start();
        /**
         * 开启d5线程,d5线程代码休眠五秒
         * 而在3秒时，主线程调用interrupt()方法,则会抛出异常
         * 异常后的代码也会被执行到
         * 如果线程在调用 sleep()方法前被中断，那么该中断称为待决中断，
         * 它会在刚调用 sleep()方法时，立即抛出 InterruptedException 异常。
         */
        try {
            Thread.sleep(3 * 1000);    // 如果线程休眠时间超过3秒，中断它
//            d5.stop();               // 过时的方法
            System.out.println("执行");
            d5.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
