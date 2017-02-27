package cn.zsza.Exception;

/**
 * Created by user on 2015/10/23.
 * 算术异常是RuntimeException的子类
 * RunTimeException
 * 如果在函数内容抛出异常，不用throws或try
 */
class DemoOne{
    int divide(int a,int b){
        if (b==0)
            throw new RuntimeException("除数不能为零");  //不throws或try能编译通过，换成Exception不能编译通过
        return a / b;
    }
}
public class RunTimeExceptionTest {
    public static void main(String[] args) {
        DemoOne demoOne = new DemoOne();
        demoOne.divide(4,0);
        System.out.println("over");
    }
}
