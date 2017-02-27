package cn.zsza.zother;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 2016/2/18.
 */
public class CalendarDemo2 {
    /**
     * 获取当前时间
     */
    @Test
    public void test1(){
		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(d);
		System.out.println(time);
    }
    @Test
    public void test2(){
        Calendar cal=Calendar.getInstance();
        cal.setTime(new Date());
        int week=cal.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println(week);
    }
    @Test
    public void test3(){
        Calendar cal=Calendar.getInstance();
        int minute = cal.get(Calendar.MINUTE);
        System.out.println("..."+minute);


    }


}
