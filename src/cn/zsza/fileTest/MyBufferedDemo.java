package cn.zsza.fileTest;
import java.io.FileReader;
import java.io.IOException;
/**
 * Created by user on 2016/3/6.
 */
class MyBufferedReader {
    private FileReader fr;
    public MyBufferedReader(FileReader fr) {
        this.fr = fr;
    }
    public String myReadLine() throws IOException{
        // 定义一个临时容器,原BufferedReader封装的是字符数组
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while((ch=fr.read())!=-1){
            if(ch=='\r')       // 13
                continue;
            if(ch=='\n')       // 10
                return sb.toString();    //如果最后一行没换行，则返回为null
            else
                sb.append((char)ch);
        }
        // 当读取到最后一行时，如果没有换行,则上面的代码不能够执行到return，所以添加下面的代码
        if(sb.toString().length()!=0){
            return sb.toString();
        }
        return null;
    }
    public void myClose() throws IOException{
        fr.close();
    }
}
public class MyBufferedDemo{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("copy.txt");

        MyBufferedReader my = new MyBufferedReader(fr);
        String line = null;
        while((line=my.myReadLine())!=null){
            System.out.println("line="+line);
        }
        my.myClose();
    }
}

