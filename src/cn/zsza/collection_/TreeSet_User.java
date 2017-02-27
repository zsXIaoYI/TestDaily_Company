package cn.zsza.collection_;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 2016/1/4.
 * 让集合元素具备比较性
 */
class MyCompare implements Comparator<Object>{
    /**
     * 比较器指定泛型是什么类型，则compare方法参数就是什么类型
     * 根据名字进行排序
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        User u1 = (User) o1;
        User u2 = (User) o2;
        int num =  u1.getName().compareTo(u2.getName());
        if (num == 0){   // 名字相同，比较年龄
            if (u1.getAge() > u2.getAge()){
                return 1;
            }else if (u1.getAge() == u2.getAge()){
                return 0;
            }
            return -1;
        }
        return num;
    }
}
class User{
    private int age;
    private String name;

    public User(int age,String name) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class TreeSet_User {
    public static void main(String[] args) {
        Set set = new TreeSet(new MyCompare());
        set.add(new User(10,"001"));
        set.add(new User(8,"003"));
        set.add(new User(12,"006"));
        set.add(new User(12,"006"));
        set.add(new User(18,"005"));
        Iterator it = set.iterator();

        while (it.hasNext()) {
            User User = (User) it.next();
            System.out.println(User.getName()+".."+User.getAge());
        }
    }
}
