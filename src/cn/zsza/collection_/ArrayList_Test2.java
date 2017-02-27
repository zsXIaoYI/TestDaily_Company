package cn.zsza.collection_;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 2015/12/28.
 */
class Collection_Demo {
    private int id;

    public Collection_Demo() {
    }

    public Collection_Demo(int id) {
        this.id = id;
    }

    public List singleElement(List al) {
        List newList = new ArrayList<>();
        Iterator it = al.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            if (!newList.contains(obj)) {
                newList.add(obj);
            }
        }
        return newList;
    }
}

public class ArrayList_Test2 {
    public static void main(String[] args) {
        /**
         * 去除集合中的重复元素
         */
        System.out.println(new Collection_Demo(1)==new Collection_Demo(2));
        List al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("a");
        al.add("c");
        System.out.println(al);
        Collection_Demo demo = new Collection_Demo();
        System.out.println(demo.singleElement(al));

    }
}
