package cn.zsza.thread;

/**
 * Created by user on 2015/12/19.
 */
class Demo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(this.getName()+"->i="+i);
            System.out.println(Thread.currentThread().getName()+"--->i="+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.setName("小一");
        d2.setName("小二");
        /**
         * 线程默认优先级为5
         * 设置优先级
         */
        /**
         * 线程优先级高的，优先执行
         */
        d1.setPriority(10);

        d1.start();
        d2.start();
    }
}
