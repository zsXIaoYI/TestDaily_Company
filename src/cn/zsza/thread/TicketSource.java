package cn.zsza.thread;

/**
 * Created by user on 2016/2/1.
 */
class TicketSource implements Runnable{
    private int ticketNum = 100;
    @Override
    public void run() {
        while (true){
            if (ticketNum > 0){
                System.out.println(Thread.currentThread().getName()+
                        "正在出售" + (ticketNum--) + "张票");
            }
        }
    }
}
