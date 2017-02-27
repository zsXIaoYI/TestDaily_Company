package cn.zsza.zother;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * PrintStream 是OutPutStream的子类
 * @author Only_you
 *
 */
public class SystemDemo1 {
	@Test
	public void test1(){
		String osName = System.getProperty("os.name");
		System.out.println("osname="+osName);
		System.out.println();
	}
	/*
	 * 向控制台输出信息
	 */
	public static void testSystemOut() throws IOException{
		//PrintStream out = System.out;
		OutputStream out = System.out;
		out.write("hello".getBytes());

	}
	public static void testSystemIn() throws IOException{
		InputStream in = System.in;
		byte buf[] = new byte[1024];
		System.out.print("请输入\r\n");
		int len = in.read(buf);
		System.out.println("输入内容的长度为:"+len);
		System.out.println("输入的内容为："+new String(buf, 0, len));
		in.close();
	}

}
