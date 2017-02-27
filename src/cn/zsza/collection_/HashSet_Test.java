package cn.zsza.collection_;

/**
 * Created by user on 2015/12/30.
 */

import java.util.HashSet;
import java.util.Iterator;

/**
 *1.hashCode返回值不同，就不会执行equals。就可以共存。
 *2.hashCode返回值相同，就会执行equals.执行了equals方法返回true,就不可以共存；
 *  返回false,就可以共存。
 * @author Only_you
 *
 */
class Persons{
    String name;
    int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        System.out.println(this.name+"执行hashCode().....");
        return name.hashCode()+age;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Persons))
            return false;
        Persons p = (Persons) obj;
        System.out.println(this.name+"...equals..."+p.name);
        return this.name.equals(p.name)&&this.age==p.age;
//        return false;
    }
}
public class HashSet_Test {
    public static void main(String[] args) {
        HashSet<Persons> hs = new HashSet<Persons>();
        hs.add(new Persons("A1",11));
        hs.add(new Persons("A2",12));
//        hs.add(new Persons("A3",13));
//
//        hs.add(new Persons("A2",12));

        hs.add(new Persons("A1",11));
//        hs.remove(new Persons("A1",11));  // 移除元素也是根据hashCode和equals方法
        Iterator it = hs.iterator();
        while(it.hasNext()){
            Persons p = (Persons) it.next();
            System.out.println(p.getAge()+"..."+p.getName());
        }
    }
}
