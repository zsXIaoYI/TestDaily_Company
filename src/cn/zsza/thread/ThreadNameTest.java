package cn.zsza.thread;

/**
 * Created by zhangsong on 2016/2/21.
 */
class RunTest extends Thread{
    private String name;
    public RunTest() {
//        System.out.println("构造方法开始");
        System.out.println(Thread.currentThread().getName());
        System.out.println(this);
        System.out.println(this.getName());
        System.out.println(Thread.currentThread()==this);
//        System.out.println("构造方法结束");
    }
    @Override
    public void run() {
        System.out.println("run方法开始");
        System.out.println(this.getName());
        System.out.println(Thread.currentThread()==this);
        System.out.println(Thread.currentThread().getName());
        System.out.println("run方法结束");
    }
}
public class ThreadNameTest {
    public static void main(String[] args) {
        RunTest rt = new RunTest();
        System.out.println("rt="+rt);
        rt.setName("cc");
//        rt.start();
        Thread t1 = new Thread(rt);
        t1.setName("xxx");
        t1.start();

    }
}
