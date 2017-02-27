package cn.zsza.abstractTest;

/**
 * 向上抽取，出现相同功能，但功能主体不同
 * 1.抽象方法一定在抽象类中
 * 2.抽象方法和抽象类必须被abstract修饰
 * 3.抽象类不能new
 * 4.如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类
 * 5.有抽象方法的类一定是抽象类
 * 6.接口中的方法只定义方法，没有方法体，而且是抽象的
 * 7.定义一个接口，实现类必须实现接口中的全部方法
 *
 * Created by user on 2015/10/21.
 */
abstract class Student{
    abstract void study();
    public void run(){                    // 抽象类可以有普通的方法
        System.out.println("学生跑");
    }
}
class Primary extends Student{
    @Override
    void study() {
        System.out.println("小学生学习");
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        Student stu = new Primary();
        stu.study();
        stu.run();
    }
}
