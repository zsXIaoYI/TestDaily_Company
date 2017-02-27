package cn.zsza.thread;

/**
 * Created by user on 2016/2/1.
 */

public class MyRunnable_Ticket {
    public static void main(String[] args) {
        // 创建资源对象
        TicketSource ts = new TicketSource();

        Thread t1 = new Thread(ts,"窗口一");
        Thread t2 = new Thread(ts,"窗口二");
        Thread t3 = new Thread(ts,"窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
