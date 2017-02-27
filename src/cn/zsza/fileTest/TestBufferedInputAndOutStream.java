package cn.zsza.fileTest;

import org.junit.Test;

import java.io.*;

/**
 * Created by user on 2016/3/6.
 */
public class TestBufferedInputAndOutStream {
    @Test
    public void testCopyPic() throws IOException {
        BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("file\\1.jpg"));
        BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("file\\2.jpg"));

        int by = 0;

        while((by=bufis.read())!=-1)
        {
            bufos.write(by);
        }

        bufos.close();
        bufis.close();
    }
}
