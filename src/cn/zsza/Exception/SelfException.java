package cn.zsza.Exception;
/**
 * Created by user on 2015/10/19.
 */
class FushuException extends Exception{
    private String name;
    public FushuException(String name){
        System.out.println("有参数的异常:"+name);
    }

    public FushuException() {
        System.out.println("无参数的异常");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
//        return super.getMessage();
        return "自定义异常的getMessage()";
    }
}
class DemoTest{
    int divide(int a,int b) throws FushuException {
        if (b < 0)
            throw new FushuException("除数不能为负数");    //要么throws,要么try catch
        return a / b;
    }
}
public class SelfException {
    public static void main(String args[]) {
        DemoTest demoTest = new DemoTest();
        int res = 0;
        try {
            res = demoTest.divide(4,-1);
        } catch (FushuException e) {       //catch捕获异常对象，并为e赋值
            System.out.println("e="+e);   // e=cn.zsza.Exception.FushuException
            e.printStackTrace();
        }
        System.out.println("res="+res);
    }
}
