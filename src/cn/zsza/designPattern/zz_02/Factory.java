package cn.zsza.designPattern.zz_02;
/**
 * 创建一个工厂接口，然后接口中定义一个
 * 返回值为Animal的方法
 */
public interface Factory {

	public abstract Animal createAnimal();
}
