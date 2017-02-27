package cn.zsza.fileTest;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user on 2016/3/6.
 */
public class TestCopyTxtByFileReaderAndWirter {
    @Test
    public void test1() throws IOException {
        // 先创建一个文件
        FileWriter fw = new FileWriter("file\\copy.txt");
        // 被读取的文件
        FileReader  fr = new FileReader("file\\cc.txt");
        int ch = 0;
        while((ch=fr.read())!=-1){     //一个一个地读
            fw.write(ch);
        }
        fw.flush();
        fr.close();
    }
    @Test
    public void test2(){
        FileWriter fw = null;
        FileReader  fr = null;
        try {
            fw = new FileWriter("file\\copy2.txt");
            fr = new FileReader("file\\cc.txt");
            char buf[] = new char[1024];
            int len = 0;
            while((len=fr.read(buf))!=-1){
                fw.write(buf,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException("读写失败");
        }finally{
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
