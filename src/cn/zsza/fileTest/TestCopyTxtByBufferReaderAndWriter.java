package cn.zsza.fileTest;

import java.io.*;

/**
 * Created by user on 2016/3/6.
 */
public class TestCopyTxtByBufferReaderAndWriter {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("file\\dd.txt"));
            bw = new BufferedWriter(new FileWriter("file\\ff.txt"));

            String line = null;
            while((line=br.readLine())!=null){    // readLine()方法返回的时候只返回回车符之前的数据内容,并不返回回车符。
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(bw!=null)
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            if(br!=null)
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
        }
    }
}
