package cn.zsza.thread;
/**
 * Thread.currentThread(); 获取当前线程对象
 * this.getName();  Thread-编号  编号从零开始
 * @author Only_you
 *
 */
class Test extends Thread{
	//private String name;

	public Test(String name) {
		super(name);
		//this.name = name;
	}
	public void run(){
		for (int i = 0; i < 50; i++) {
			System.out.println("是否为一个对象："+(Thread.currentThread()==this));
			System.out.println(this.getName()+" is runing "+i);
		}
	}
	
}
public class TestThread {
	public static void main(String[] args) {
		Test t1 = new Test("cc");
		Test t2 = new Test("dd");
		t1.start();
		t2.start();
		
		for (int i = 0; i < 60; i++) {
			System.out.println(i+" main is running");
		}
	}

}
