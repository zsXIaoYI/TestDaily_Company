package cn.zsza.zother;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by user on 2016/2/18.
 * Runntime类没有构造方法，不能new 对象
 */
public class RunntimeDemo {
    @Test
    public void test1() throws IOException {
        Runtime r = Runtime.getRuntime();

        r.exec("D:\\Program Files (x86)\\QQ\\Bin\\QQScLauncher.exe");
    }
}
