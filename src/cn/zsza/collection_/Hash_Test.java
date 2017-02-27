package cn.zsza.collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 2015/12/30.
 */
class Demo{
    @Override
    public int hashCode() {
        System.out.println("执行");
        return 32;
    }
}
public class Hash_Test {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 == d2);
        Set set = new HashSet<>();
        /**
         * 按a、c、b的顺序存入，取出的顺序却是a、b、c
         */
        set.add("a");
        set.add("c");
        set.add("b");
        set.add("b");
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
