package cn.zsza.designPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * Created by user on 2016/4/12.
 */
public class JDKProxyFactory implements InvocationHandler  {
    private Object targetObject;

    // 创建目标对象的代理对象
    public Object createProxyInstance(Object targetObject){
        this.targetObject = targetObject;
        Object proxyInstance = Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
                this.targetObject.getClass().getInterfaces(), this);
        return proxyInstance;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke方法执行");
        PersonServiceBean bean = (PersonServiceBean) this.targetObject;
        Object result = null;
        if (bean.getUser()!=null){
            result = method.invoke(targetObject,args);
        }
        System.out.println("result= "+result);
        return result;
    }
}
