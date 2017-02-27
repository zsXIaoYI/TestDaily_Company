package cn.zsza.fileTest;

import java.io.*;

/**
 * Created by user on 2016/3/7.
 * OutputStreamWriter 是字符流通向字节流的桥梁
 */
public class TestOutputStreamWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        OutputStream out = System.out;

        OutputStreamWriter osw = new OutputStreamWriter(out);

        BufferedWriter buw = new BufferedWriter(osw);
        String line = null;
        while ((line=bufr.readLine())!=null){
            if ("over".equals(line))
                break;
            buw.write(line);
            buw.newLine();
            buw.flush();
        }
        bufr.close();
    }
}
