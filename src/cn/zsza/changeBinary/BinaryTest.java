package cn.zsza.changeBinary;

import org.junit.Test;

/**
 * Created by user on 2016/2/29.
 */
public class BinaryTest {
    // 十进制转换成二级制
    @Test
    public void testTen_Two(){
        int num = 10;
        StringBuffer sb = new StringBuffer();
        while(num>0){
            sb.append(num%2);
            num = num/2;
        }
        System.out.println("十进制数转换二进制位："+sb.reverse());
    }

}
