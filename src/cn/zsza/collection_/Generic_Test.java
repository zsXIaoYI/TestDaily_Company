package cn.zsza.collection_;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Created by zhangsong on 2016/1/4.
 */
class Utils<QQ>{
    private QQ qq;
    public QQ getQq() {
        return qq;
    }
    public void setQq(QQ qq) {
        this.qq = qq;
    }
}
class Worker{
}
/**
 * 泛型类，指定泛型T，泛型类中定义一个方法，方法参数指定类型为T
 * @param <T>
 */
class Method<T>{
    public void show(T t){
        System.out.println("show:"+t);
    }
}
/**
 * 泛型方法
 */
class Method2{
    public <T> void show(T t){
        System.out.println("show:"+t);
    }
}
/**
 * 泛型接口
 * @param <T>
 */
interface UU<T>{
    void show(T t);
}
/**
 * 实现类指定String类型
 */
class UUImpl implements UU<String>{
    @Override
    public void show(String s) {
        System.out.println("s"+s);
    }
}

/**
 * 实现类指定泛型T,实现泛型的接口
 * @param <T>
 */
class UUImpl2<T> implements UU<T>{
    @Override
    public void show(T t) {
        System.out.println("t="+t);
    }

    public <T> void show2(T t){
        System.out.println("show:"+t);
    }
    public <T> T show3(T t){

        return t ;
    }
//    public <T> T show4(T t){
//        T t1 = new Object();
//        return t ;
//    }
}
public class Generic_Test {
    @Test
    public void test1(){
        List list = new ArrayList();   // 没指定泛型
        list.add("abc");
        list.add("ad");
        list.add("adss");
        /**
         * java.lang.ClassCastException:
         * java.lang.Integer cannot be cast to java.lang.String
         * 在集合进行遍历到下面的整型元素时会报异常
         */
        list.add(4);
        Iterator it = list.iterator();
        while (it.hasNext()){
            String str = (String) it.next();
            System.out.println(str+"..."+str.length());
        }
    }
    @Test
    public void test2(){
        Utils<Worker> utils = new Utils<>();
        System.out.println(utils);
        utils.setQq(new Worker());
        System.out.println(utils.getQq());
    }
    /**
     * 一个String 类型的泛型，泛型定义到类上有局限性
     */
    @Test
    public void test3(){
        Method<String> method = new Method<>();
        method.show("小伊伊");
    }
    /**
     * 泛型定义到方法上，方法参数是什么类型，就操作什么类型
     */
    @Test
    public void test4(){

        Method2 me = new Method2();
        me.show("小萌猴");
        me.show(123);
    }
    @Test
    public void test5(){
        UUImpl2<String> uuImpl2 = new UUImpl2<>();

        uuImpl2.show("小小");
        uuImpl2.show2("大大");

        ArrayList<String> list = uuImpl2.show3(new ArrayList<String>());
        list.add("aa");
        list.add("bb");
        list.add("cc");
        System.out.println("list=" + list);
    }
}
