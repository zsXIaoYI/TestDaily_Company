package cn.zsza.collection_;

import java.util.*;

/**
 * Created by zhangsong on 2016/1/7.
 */
class Users{
   private String name;
    public Users(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class PP extends Users{
    public PP(String name) {
        super(name);
    }
}
class MyCom implements Comparator<Users>{
    @Override
    public int compare(Users o1, Users o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class Generic_Test3 {
    public static void main(String[] args) {
        Set<PP> set = new TreeSet(new MyCom());
        set.add(new PP("001"));
        set.add(new PP("003"));
        set.add(new PP("002"));
        Iterator<PP> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
        ArrayList<PP> list = new ArrayList<>();
        list.add(new PP("hh"));
        list.add(new PP("gg"));
        getArrayList(list);
    }

    /**
     * 方法参数接收PP以及PP的父类
     * @param al
     */
    public static void getArrayList(ArrayList<? super PP> al){
        Iterator<? super PP> it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}

