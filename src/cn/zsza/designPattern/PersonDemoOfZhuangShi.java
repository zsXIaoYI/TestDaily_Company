package cn.zsza.designPattern;
/**
 * 装饰模式
 * 装饰设计模式：当想要对已有的对象进行功能增强时，可以定义类，将已有对象传入，基于已有的功能，
 * 并提供加强功能。那么自定义的该类称为装饰类。
 */
class Person{
	public void eat(){
		System.out.println("吃饭");
	}
}
/**
 * SuperPerson为装饰类
 */
class SuperPerson{                // SuperPerson为装饰类
	private Person p;
	public SuperPerson(Person p) {
		this.p = p;
	}
	public void superEat(){
		System.out.println("小酒一斟");
		p.eat();
		System.out.println("饭后一根烟");
	}
}
public class PersonDemoOfZhuangShi {
	public static void main(String[] args) {
		Person p = new Person();
		SuperPerson sp = new SuperPerson(p);
		sp.superEat();
	}

}
