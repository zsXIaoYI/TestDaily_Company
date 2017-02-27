package cn.zsza.fileTest;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user on 2016/3/6.
 */
public class TestBufferedWriter {
    @Test
    public void test1() throws IOException {
        // 创建一个字符写入流对象
        FileWriter fw = new FileWriter("file\\dd.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 3; i++) {
            bw.write("我是小xx");
            bw.newLine();
            bw.flush();      // 记住刷新
        }
        bw.close();     //把流对象也关闭了。
    }
}
