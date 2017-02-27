package cn.zsza.abstractTest;
/**
 * 抽象类可以有构造方法，也可以有普通的方法
 */
abstract class students{
	String name;
	int age;
	String sex;
	public students(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public abstract void study();
	public void sleep(){
		System.out.println("学生休息");
	}
	
}
class stu extends students{
	public stu(String name, int age, String sex) {
		super(name, age, sex);
	}
	public void study() {
		System.out.println(name + "学习");
		}
	}

public class TestAbstract {
	public static void main(String[] args) {
		students st = new stu("小伊伊", 18, "nv");
		st.study();
		st.sleep();
	}

}
