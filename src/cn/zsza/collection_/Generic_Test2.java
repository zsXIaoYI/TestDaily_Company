package cn.zsza.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhangsong on 2016/1/7.
 */
class People{
}
class Stu extends People{
}
public class Generic_Test2 {
    /**
     * 声明一个参数可以接受任何类型的，迭代ArrayList 的方法
     * ？代表占位符
     */
    public void getArrayList(ArrayList<?> arrayList){
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public <T> void  getArrayList2(ArrayList<T> arrayList){
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()){
            T t = it.next();
            System.out.println(t);
        }
    }
    /**
     * 泛型限定：
     * <? extends People> :指定泛型为People以及子类
     * <? super People>: 指定泛型为People以及父类
     * @param al
     */
    public void getArrayList3(ArrayList<? extends People> al){
        Iterator<? extends People> it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void add(int a){

    }
    public void add(){

    }
}
