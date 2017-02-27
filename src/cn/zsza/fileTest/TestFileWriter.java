package cn.zsza.fileTest;

/**
 * Created by user on 2016/3/6.
 */

import java.io.FileWriter;
import java.io.IOException;

/**
 * 关闭流后，写入不进去，关闭流之前 先调用flush()
 * 只调用close()方法也会写进去
 * 该目录下有同名文件，则会被覆盖
 * @author Only_you
 *
 */
public class TestFileWriter {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("file\\cc.txt");
        // 在文件的末尾续写 有同名文件，不覆盖，续写
        FileWriter fw = new FileWriter("file\\cc.txt",true);
        //将字符串写入到流中
        fw.write("大家好\r\n");
        fw.write("小伊伊\r\n");

        fw.flush();
        //fw.close();
    }

}

