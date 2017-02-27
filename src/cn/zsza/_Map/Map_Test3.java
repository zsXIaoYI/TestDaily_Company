package cn.zsza._Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 2016/1/21.
 */
public class Map_Test3 {
    public static void main(String[] args) {

        // 声明一个学校
        Map<String,Map<String,String>> school = new HashMap<>();
        // 声明2个班级，班级放学生id和姓名
        Map<String,String> room1 = new HashMap<>();
        Map<String,String> room2 = new HashMap<>();

        room1.put("01","小一一");
        room1.put("02","小二二");
        room2.put("01","大一一");
        room2.put("02","大二二");

        school.put("小班",room1);
        school.put("大班",room2);

        Iterator<String> it = school.keySet().iterator();
        while (it.hasNext()){
            String classKey = it.next();
            Map<String,String> className = school.get(classKey);
            getStudentInfo(className);
        }

    }
    public static void getStudentInfo(Map<String,String> roomMap){
        Iterator<String> it = roomMap.keySet().iterator();
        while (it.hasNext()){
            String id = it.next();
            String name = roomMap.get(id);
            System.out.println(id+"...."+name);
        }
    }
}
