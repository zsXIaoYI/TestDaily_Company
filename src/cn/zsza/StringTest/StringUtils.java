package cn.zsza.StringTest;

import java.io.UnsupportedEncodingException;

/**
 * 字符串工具类
 * @author sf
 *
 */
public class StringUtils {
	/*
	 * 1.判断字符串是否为空
	 */
	public static boolean isNull(String str){
		return str == null || str.trim().length()==0;
	}
	/*
	 * 2.转换编码
	 */
	public static String changeBianMa(String object) throws UnsupportedEncodingException {
		//String objectnew=new String(object.getBytes("iso-8859-1"),"UTF-8");
		//return objectnew;
		return object;
	}

	public static String testIsNull(){

		if(isNull("11"))
			return "kong";
		System.out.println("zsza");
		return "bukong";
	}
}
