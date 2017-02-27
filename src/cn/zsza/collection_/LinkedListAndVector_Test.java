package cn.zsza.collection_;

import org.junit.Test;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by user on 2015/12/23.
 * Vector支持枚举
 */
public class LinkedListAndVector_Test {
    /**
     * 支持枚举
     */
    @Test
    public  void test1(){
        Vector vector = new Vector(11);
        vector.add("a");
        vector.add("c");
        vector.add("b");

        Enumeration en = vector.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }
    /**
     * Created by user on 2015/12/28.
     * 使用LinkedList模拟一个堆栈
     * 堆栈：先进后出
     * 队列：先进先出，First In Last Out
     */
    @Test
    public void testLinkedList(){
        /**
         * pollFirst():
         *   获取并移除此列表的第一个元素；如果此列表为空，则返回 null。
         * offerFirst():
         *    在此列表的开头插入指定的元素。
         */
        LinkedList list = new LinkedList();
//        list.addFirst("a");   // 倒序存储
//        list.addFirst("c");
//        list.addFirst("b");
//        list.addFirst("f");

        list.add("a");
        list.add("c");
        list.add("b");
        System.out.println(list);    // [f, b, c, a]
        System.out.println(list.getFirst());
        // removeFirst(),取出元素，并删除
        while (!list.isEmpty()){
            System.out.println(list.removeFirst());
        }
    }

    /**
     * LinkedList模仿队列
     */
    @Test
    public void testLinkedList2(){
        Queue queue = new Queue();
        queue.myAdd("a");
        queue.myAdd("c");
        queue.myAdd("b");
        while (!queue.isNull()){
            System.out.println(queue.myGet());
        }
    }

}
class Queue{
    private LinkedList linkedList;

    public Queue() {
        linkedList = new LinkedList();
    }
    public void myAdd(Object obj){
        linkedList.addFirst(obj);
    }
    public Object myGet(){
        return linkedList.removeLast();
    }
    public boolean isNull(){
        return linkedList.isEmpty();
    }
}
