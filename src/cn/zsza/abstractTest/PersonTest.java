package cn.zsza.abstractTest;

/**
 * Created by zhangsong on 2016/2/21.
 */
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    Person() {
        System.out.println("Person类");
    }
    public String getName() {
//        System.out.println(name);
//        return name;
        return "xx";
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Per extends Person{
    public Per(){
        System.out.println(this);
        System.out.println(this.getName());
    }
    public Per(String name) {
        super(name);
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Per pp = new Per();
        /**
         * 构造方法 public Per()中的this就是上述的pp
         */
        System.out.println(pp);
    }
}
