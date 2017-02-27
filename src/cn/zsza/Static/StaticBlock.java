package cn.zsza.Static;

class StaticData{
	static{
		System.out.println("StaticData初始化");
	}

	public StaticData() {
		System.out.println("构造方法定义");
	}
	{
		System.out.println("MiddleStatic");
	}
}

/**
 * 静态代码块，static代码块随着类的加载，加载到内存。。。
 *
 */
	public class StaticBlock {
	public static void main(String[] args) {
		new StaticData();
		System.out.println("****");
//		new StaticD ata();
	}
}
