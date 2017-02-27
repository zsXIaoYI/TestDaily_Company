package cn.zsza.collection_;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 2015/12/31.
 */
class Student implements Comparable{
    private int age;
    private String name;
    public Student(int age,String name) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Student)){
            throw new RuntimeException("不是学生对象");
        }
        Student stu = (Student) o;
        System.out.println(this.name+"Compare..."+stu.name);
        if (this.age > stu.age){
            return 1;
        }else if (this.age == stu.age){
//            return 0;
            return this.name.compareTo(stu.name);
        }
        return -1;
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
public class TreeSet_Student {
    public static void main(String[] args) {
        new Student(12,"小黑");
        System.out.println("--------------------");
        Set set = new TreeSet();
        set.add(new Student(10,"小一"));
        set.add(new Student(8,"小二"));
        set.add(new Student(12,"小三"));
        set.add(new Student(12,"小四"));  // Compare方法返回0，小四则存不进去
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Student student = (Student) it.next();
            System.out.println(student.getName()+".."+student.getAge());
        }
    }
}
