package cn.zsza.collection_;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;

/**
 * Created by user on 2015/12/21.
 */
public class ArrayList_Test {
    @Test
    public void test1(){
        List al = new ArrayList();
        ArrayList cc = new ArrayList();
        /*
          1.添加元素,所谓ArrayList有序，即存入的顺序和取出的顺序一致
         */
        al.add("b");
        al.add("a");
//        al.add("a");
        al.add("c");
        Iterator it = al.iterator();
        while (it.hasNext()){
//            if ("a".equals(it.next()))
            System.out.println(it.next());
        }
        for (int i =0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
//        for (Iterator itt = al.iterator();itt.hasNext();) {     // 迭代器
//            System.out.println(itt.next());
//        }
        // 2.集合元素的个数
        System.out.println(al.size());
        // 3. 移除集合中的某个元素;清空集合：al.clear();
        al.remove("a");
        // 4. 判断某个元素是否存在于集合;判断是否为空：al.isEmpty();
        System.out.println(al.contains("b"));
        // 5. al.retainAll(al2); 取al和al2的交集，并且把交集放到al中
        // 6. al.removeAll(al3); 取al和al3的交集，在al中除去交集
        // 7. 获取某元素第一次出现的位置
        System.out.println("a第一次出现的位置：" + al.indexOf("a"));
        // 8. add(int index, E element)  subList(from,to) remove(int index) set(index,ele);
    }
    @Test
    public void test2(){
        /*
        List特有的迭代器ListIterator,该迭代器在迭代的同时，可以添加、删除、修改，而Iterator则会报
        会报java.util.ConcurrentModificationException
         */
        List al = new ArrayList();

        al.add("b");
        al.add("a");
        al.add("d");
        al.add("c");
        ListIterator listIterator = al.listIterator();
        while (listIterator.hasNext()){
            String obj = (String) listIterator.next();
            if ("a".equals(obj))
                listIterator.add("aa");
            System.out.println("obj="+obj);
        }
        System.out.println(al);

//        while (listIterator.hasPrevious())                // 逆向遍历
//            System.out.println(listIterator.previous());

    }
    @Test
    public void sortList(){
        Logger logger = Logger.getLogger(ArrayList_Test.class);
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("5");
        list.add("1");
        list.add("aa");

        Object temp[] = list.toArray();
        Arrays.sort(temp);
        list = (List)Arrays.asList(temp);
        System.out.println("排序后的list:"+list);
        logger.info("...list:"+list);

    }


}

