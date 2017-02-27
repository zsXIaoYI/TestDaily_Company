package cn.zsza.thread;

/**
 * Created by user on 2016/4/18.
 * currentThread()可以返回代码段正在被哪个线程调用
 */
class RunTest2 extends Thread{
    private String name;
    public RunTest2() {
//        System.out.println("构造方法开始");
        System.out.println("this="+this+" , this的名字："+this.getName()); // 返回Thread-0
        System.out.println(Thread.currentThread().getName());
        System.out.println("...." + this.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("run方法开始");
        System.out.println(this.getName());
        System.out.println(Thread.currentThread()==this);
        System.out.println(Thread.currentThread().getName());

    }
}
public class ThreadNameTest2 {
    public static void main(String[] args) {
        RunTest2 rt = new RunTest2();
        /**
         * 设置线程的名字，则run()方法中的Thread.currentThread()==this
         */
        //rt.setName("cc");   // 则run方法中this.getName()返回cc
        //rt.start();

        Thread t = new Thread(rt);
        t.setName("aa");
        t.start();

    }
}

