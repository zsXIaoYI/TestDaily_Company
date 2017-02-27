package cn.zsza.fileTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by user on 2016/3/7.
 * InputStreamReader 是字节流通向字符流的桥梁
 */
public class TestInputStreamReader {
    public static void main(String[] args) throws IOException {
        //获取键盘录入对象。
        InputStream in = System.in;
        //将字节流对象转成字符流对象，使用转换流。InputStreamReader
        InputStreamReader isr = new InputStreamReader(in);

        //为了提高效率，将字符串进行缓冲区技术高效操作。使用BufferedReader
        BufferedReader bufr = new BufferedReader(isr);
        String line = null;
        while ((line=bufr.readLine())!=null){
            if ("over".equals(line))
                break;
            System.out.println(line);
        }
    }
}
