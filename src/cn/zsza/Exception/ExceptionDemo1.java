package cn.zsza.Exception;

import org.junit.Test;

/**
 * Created by user on 2015/10/16.
 */
class Demo{
    int divide(int a, int b) throws Exception{
        return a / b;
    }
}
public class ExceptionDemo1 {
    @Test
    public void test1() throws Exception{
        int a  = 1/0;                //java.lang.ArithmeticException: / by zero
        System.out.println("a="+a);
    }
    @Test
    public void test2(){
        Demo demo = new Demo();
        try {
            int a = demo.divide(1,0);
            System.out.println("a="+a);
        } catch (Exception e) {
            System.out.println("错误信息："+e.getMessage());
//            throw new RuntimeException(e);
//            e.printStackTrace();
        }
    }
}
