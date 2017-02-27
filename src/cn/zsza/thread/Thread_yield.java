package cn.zsza.thread;

/**
 * Created by user on 2015/12/31.
 */
class Demo3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println(this.getName()+"->i="+i);
            Thread.yield();
            // 线程礼让，让线程执行的更和谐一些，但不能保证一个线程执行一次
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
public class Thread_yield {
    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        Demo3 d2 = new Demo3();

        d1.setName("小一");
        d2.setName("小二");
        d1.start();
        d2.start();
    }
}
