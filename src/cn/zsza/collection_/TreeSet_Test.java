package cn.zsza.collection_;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 2015/12/30.
 */
public class TreeSet_Test {
    @Test
    public void test1(){
        Set set = new TreeSet<>();
//        Set set = new HashSet<>();
        set.add("a");
        set.add("c");
        set.add("b");

        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
    @Test
    public void test2(){
        int a = 4;
        String str = new String(String.valueOf(a));

        int arr[] = new int[3];
        arr[0] = 2;
    }
}
