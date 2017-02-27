package cn.zsza.designPattern;

import org.junit.Test;

/**
 * Created by user on 2015/11/26.
 * 单列设计模式
 * 解决一个类在内存中只存在一个对象
 */
class Single{
    private Single(){}
    private static Single s = new Single();
    public static Single getInstance(){
        return s;
    }
}
public class SinglePattern {
    @Test
    public void test1(){
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1==s2);
    }
}
