package cn.zsza.StringTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import org.junit.Test;

/**
 * Created by user on 2015/10/21.
 */
public class TestString {
    private InputStream openStream;
    @Test
    public void test1(){
        String str = "小萌\\n猴";
        System.out.println("str="+str.replace("\\n","h"));
    }
    @Test
    public void testReplaceAll(){
        String str1 = "!!Tutorials!!Point", str2;
        String substr = "**", regex = "!!";

        System.out.println("str1="+str1);

        str2 = str1.replaceAll(regex, substr);
		/*
		 * 执行replaceAll方法后
		 * str2=**Tutorials**Point
		 */
        System.out.println("str2="+str2);
    }
    @Test
    public void isNull() throws UnsupportedEncodingException {
        String str1 = null;
        String str2 = "  ";
        String str3 = "zsza";
        String str4 = "小伊伊";

        System.out.println("str2的长度："+str2.length());
        System.out.println("str1是否为空："+StringUtils.isNull(str1));
        System.out.println("str2去除空格后是否为空："+StringUtils.isNull(str2));
        if(!StringUtils.isNull(str3))
            System.out.println("str3你快出来吧~！");

        System.out.println("我还是执行一下吧~！");

        str4 = StringUtils.changeBianMa(str4);

        System.out.println("str4="+str4);
    }
    @Test
    public void testSplit(){
        String str = "zs,za,5466";
        //以逗号分隔字符串，成字符串数组，然后把第一个元素赋值给str1
        String str1 = str.split(",")[0];

        String[] str2 = str.split(",",2);
        //上面spilt()函数中的第二个参数指返回字符串数组的最大长度

        for (int i = 0; i < str2.length; i++) {
            System.out.println("str2["+i+"]="+str2[i]);
        }

        System.out.println("str1="+str1);
    }
    @SuppressWarnings("unchecked")
    @Test
    public void testMap(){
        HashMap hs = new HashMap();
        hs.put("as", 10);

        hs.put("bs", 11);
        hs.put("1122", 12);



        Object str = hs.get("as");
        System.out.println("str="+str);
        System.out.println("hs="+hs);
    }
    @Test
    public void testNewString(){
        byte bytes[] = {65,66,67};
        String str = new String(bytes, 0, 2);   //从byte数组取从零开始，取2个元素组成字符串
        System.out.println("str="+str);
    }
    @Test
    public void testStringContains(){
        String str = "zsza5466";
        boolean contains = str.contains("za");
        System.out.println("contains="+contains);
    }
    @Test
    public void testURL() throws IOException{
        URL url = new URL("http://www.baidu.com");
        openStream = url.openStream();
        System.out.println("openStream="+openStream);
    }
    @Test
    public void  testReturn(){
        String str = StringUtils.testIsNull();
        System.out.println("str="+str);
    }
    /*
     * null == equals方法
     */
    @Test
    public void testNull(){
        String str = "null";
        String str1 = null;
        String str2 = " ";
        if("null".equals(str))
            System.out.println("空字符串");

        if(str1==null)
            System.out.println("str1是一个空字符串");

        if(!str2.isEmpty())
            System.out.println("str2长度为："+str2.length());
    }
    @Test
    public void testCompareTo(){
        String str = "8.2";
        String str1 = "9.2";

        String str3 = "a";
        String str4 = "b";
        System.out.println("str.compareTo(str1)..."+str.compareTo(str1));
        System.out.println("str3.compareTo(str4)..."+str3.compareTo(str4));
    }

    @Test
    public void testStringReader() throws IOException{
        String str = "superstar";
        StringReader sr = new StringReader(str);
        StringWriter sw = new StringWriter();

        char arr[] = new char[1024];
        int len = 0;
        while((len = sr.read(arr)) != -1){
            System.out.println("len="+len);
            String strRead = new String(arr,0,len).toUpperCase();
            System.out.println("strRead="+strRead);
            sw.write(strRead);
            sw.flush();
        }
        sr.close();
        sw.close();
    }
    /*
     * 字符串数组转换成字符串
     * 字符数组转换成字符串
     */
    @Test
    public void testStringArray(){
		/*
		 * 字符串数组转换成字符串
		 */
        String str[] = new  String[]{"zs","za","5466"};
        StringBuffer  sb = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        String str1 = sb.toString();
        System.out.println("str1="+str1);
		/*
		 * 字符数组转换成字符串
		 */
        char chars[] = new char[]{'z','s','z','a'};
        String str3 = new String(chars);
        System.out.println("str3=" + str3);
    }
    @Test
    public void stringlength(){
        //String str = "[\\x00-\\x08\\x0b-\\x0c\\x0e-\\x1f]";
        String str = "abD";
        str = str.toUpperCase();
        System.out.println("str="+str);
    }
    @Test
    public void testSubString(){
        String str = "zsza5466java",str1,str2;
        CharSequence str3;
        str1 = str.substring(2);  //截取从第二个开始到末尾的全部字符

        str2 = str.substring(2, 6); // 截取 2 3 4 5位置上的字符组成一个子串

        str3 = str.subSequence(2, 6);
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);
        System.out.println("str3="+str3);

    }
    @Test
    public void testOtherString(){
        String str = "zsaza5466java";
        String str1 = "heihei";

        char charAt = str.charAt(1);               // 取字符串指定位置的字符
        String concat = str.concat(str1);          // 把str1拼接到str后面
        boolean endsWith = str.endsWith("va");
        byte[] bytes = str.getBytes();
        int indexOf = str.indexOf("za");           //a的十进制为97，十六进制数为61，indexOf的参数可以为字符(串)，也可以为其ASCII
        int indexOf2 = str.indexOf(97, 2);         //从第二个位置查找a,找到返回第一次出现的位置，找不到返回-1
        int lastIndexOf = str.lastIndexOf('a');
        int lastIndexOf2 = str.lastIndexOf(97, 5);  // 从第五个位置开始，往前查找，查找该字符第一次出现的位置。
        char[] charArray = str.toCharArray();
        String valueOf = String.valueOf(true);

        System.out.println("valueOf="+valueOf);
        System.out.println("charArray="+charArray.toString());
        System.out.println("lastIndexOf2="+lastIndexOf2);
        System.out.println("lastIndexOf="+lastIndexOf);
        System.out.println("indexOf2="+indexOf2);
        System.out.println("indexOf="+indexOf);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println("bytes["+i+"]="+bytes[i]);
        }
        System.out.println("endsWith="+endsWith);
        System.out.println("concat="+concat);
        System.out.println("charAt="+charAt);
    }
    /*
     * 把当前时间转化成字符串输出
     */
    @Test
    public void testStringDate(){
        Date now = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time = format.format(now);
        System.out.println("time= "+time);
    }
    @Test
    public void testFanXieGang(){
        String a = "abc\\";
        System.out.println("a="+a);   // a = abc\
    }
    @Test
    public void tesLingXing(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    @Test
    public void testIntArrayToStr(){
        int bb[] = new int[]{1,2,3,5,8};
        String cc = Arrays.toString(bb);
        System.out.println("cc="+cc);
        System.out.println("cc的长度"+cc.length());
    }
    @Test
    public void testStringBuilder(){
        StringBuilder sb = new StringBuilder();
    }
    @Test
    public void testMemoryOfString1(){
        String s1 = "aaa";         // "aaa"是一个对象
        String s2 = "aaa";
        System.out.println("s1是否等于s2:"+(s1==s2)); // true


        String s3 = "ab";
        String s4 = "cd";
        String s5 = s3 + s4;
        String s6 = "abcd";
        System.out.println("s5是否等于s6:"+(s5==s6));  // false


        String ab = "a" + "b";
        String ab_ = "ab";
        System.out.println(ab == ab_);   // true
        // 只有使用引号包含文本的方式创建的String对象之间使用“+”连接产生的新对象才会被加入字符串池中

        String str = "aa";
        String str1 = new String("aa");
        String str_ = str;
        System.out.println("str是否等于str_:"+(str==str_));
        System.out.println("str是否等于str1"+(str==str1));   // false
    }
    @Test
    public void testMemoryOfString2(){
        String a = "hello2";
        /**
         * 由于变量b被final修饰，因此会被当做编译器常量，所以在使用到b的地方会直接将变量b替换为它的值
         */
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));    // true
        System.out.println((a == e));    // false
    }
    @Test
    public void testaa(){
        String s1 = new String("aa");
        String s2 = "aa";
        System.out.println(s1.equals(s2));
    }
    @Test
    public void testSpilt(){
        String str = "soufun-s323582$2016-05-13 16:20:59";
        System.out.println(str.split("\\$")[0]);
    }
}
