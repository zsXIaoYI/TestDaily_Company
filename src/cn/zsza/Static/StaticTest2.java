package cn.zsza.Static;

/**
 * Created by user on 2016/4/17.
 */
class A{
    static {
        System.out.println("A类中的静态代码块");
    }
    public A() {
        System.out.println("构造A");
    }
}

/**
 * a作为class B的成员变量，
 * 在生成B的对象时，先对a进行实例化
 */
class B{
    int num;
    A a = new A();
    static {
        System.out.println("B类中的静态代码块");
    }
    public B() {
        System.out.println("构造B");
    }
}
public class StaticTest2 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.num);
    }
}
