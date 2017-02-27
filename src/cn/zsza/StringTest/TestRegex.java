package cn.zsza.StringTest;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by user on 2016/2/29.
 */
public class TestRegex {
    @Test
    public void test1(){
        String st1 = "\\";  // "\"转义后为"\\"
        System.out.println("st1="+st1);
    }
    // 把字符串中的2个aa替换成z
    @Test
    public void test2(){
        String st1 = "aaabaaacaaa";
        String st2 = st1.replaceAll("a{2}", "z");
        System.out.println("st2="+st2);
    }
    @Test
    public void test3(){
        String st1 = "aaabaaca";
        String st2 = st1.replaceAll("a{2,3}", "\\*");  //把字符串中的a,替换为*
        System.out.println("st2="+st2);
    }
    @Test
    public void test4(){
        String st1 = "1234abc435def";
        String st2 = st1.replaceAll("\\D","0"); // 把字符串中非数字字符,用0替换
        System.out.println("st2="+st2);
    }
    @Test
    public void test5(){
        String s = "@Shang Hai Hong Qiao Fei Ji Chang";
        String regEx = "a|F";    // 表示a或F
        Pattern pat = Pattern.compile(regEx);
        //  Pattern.compile(regEx, Pattern.CASE_INSENSITIVE); 忽略大小写
        Matcher mat = pat.matcher(s);
        boolean rs = mat.find();
        System.out.println("rs="+rs);
    }
    @Test
    public void test6(){
        String s = "<adef>";
        System.out.println(s);
        String regEx = "[abc]";

        Pattern pat = Pattern.compile(regEx);
        Matcher mat = pat.matcher(s);
        boolean rs = mat.find();
        System.out.println("rs="+rs);
    }



}

