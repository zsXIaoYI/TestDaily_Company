package cn.zsza.designPattern.Proxy;

/**
 * Created by user on 2016/4/12.
 */
public class ProxyTest {
    public static void main(String[] args) {
        JDKProxyFactory jdkProxyFactory = new JDKProxyFactory();
        /**
         * 接口引用指向代理对象
         * 代理对象实现了目标对象的所有接口
         */
        PersonService personService = (PersonService) jdkProxyFactory.createProxyInstance(new PersonServiceBean("小萌猴"));
        personService.add("");  // 调用这个方法，invoke方法被调用
//        System.out.println("personService="+personService);

    }
}
