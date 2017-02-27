package cn.zsza.Static;

/**
 * Created by user on 2016/4/17.
 */
class Father{
    static {
        System.out.println("父类静态代码块");
    }
    public Father() {
        System.out.println("父类构造方法");
    }
}
class Son extends Father{
    static {
        System.out.println("子类静态代码块");
    }
    public Son() {
        System.out.println("子类构造方法");
    }
}
public class StaticTest {
    public static void main(String[] args) {
        new Son();
    }
}
