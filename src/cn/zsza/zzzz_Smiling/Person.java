package cn.zsza.zzzz_Smiling;

/**
 * Created by user on 2016/4/14.
 */
public class Person {
    public int num;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return num == person.num;
//        return true;
    }

//    @Override
//    public int hashCode() {
//        System.out.println("hashcode");
//        return 12;
//    }

public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    p1.num = 2;
    p2.num = 3;
    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());
    System.out.println(p1 == p2);
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(new AA()));


    }
}
class AA{}
