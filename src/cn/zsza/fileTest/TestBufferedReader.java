package cn.zsza.fileTest;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 2016/3/6.
 */
public class TestBufferedReader {
    @Test
    public void test1() throws IOException {
//        FileReader fr = new FileReader("e:\\aa.txt");
        FileReader fr = new FileReader("file\\dd.txt");

        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while((line=br.readLine())!=null){
            System.out.println("line="+line);
        }
        br.close();
    }
}
