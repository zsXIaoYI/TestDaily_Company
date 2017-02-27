package cn.zsza.fileTest;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by user on 2016/3/7.
 */
public class TestFileOperate {
    @Test
    public void test1(){
        File f1 = new File("e:\\file\\f1.txt");

        File f2 = new File("e:\\file","f2.txt");

        File d = new File("e:\\file");
        File f3 = new File(d,"f3.txt");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(File.separator);
    }
    @Test
    public void test2() throws IOException {
        File f1 = new File("file\\f1.txt");
        System.out.println(f1.isFile());   // 是否是文件
        System.out.println(f1.exists());   // 文件是否存在
//        f1.createNewFile();

        File f2 = new File("e:\\file\\aa.txt");
//        f2.mkdirs();                     // 创建多级目录
//        f2.mkdir();
        f2.createNewFile();
        System.out.println(f2.exists());


    }
}
