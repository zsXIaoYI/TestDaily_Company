package cn.zsza.thread;

/**
 * Created by user on 2015/12/31.
 */
class Demo4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++){
            System.out.println(this.getName()+"->i="+i);
    }
 }
}
public class Thread_Daemon {
    public static void main(String[] args) {
        /**
         * 守护线程：主线程执行完毕，守护线程紧跟着停止执行
         */
        Demo4 d1 = new Demo4();
        Demo4 d2 = new Demo4();
        d1.setName("小一");
        d1.setName("小二");

        d1.setDaemon(true);   // 设置守护线程
        d2.setDaemon(true);

        d1.start();
        d2.start();
        Thread.currentThread().setName("主公");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }
}
