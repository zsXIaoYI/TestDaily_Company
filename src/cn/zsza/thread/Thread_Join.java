package cn.zsza.thread;

/**
 * Created by user on 2015/12/31.
 */
class Demo2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println(this.getName()+"->i="+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
public class Thread_Join {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2();

        d1.setName("小一");
        d2.setName("小二");
        /**
         * 线程默认优先级为5
         * 设置优先级
         */
//        d1.setPriority(10);
        try {
            d1.join();    // 线程d1执行完毕后，d2线程才开启
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d1.start();
        d2.start();
    }
}
