package cn.zsza._Map;

import org.junit.Test;
import java.util.*;

/**
 * Created by zhangsong on 2016/1/10.
 */
public class Map_Test {
    @Test
    public void test1(){
        Map<String,String> map = new HashMap<>();
        map.put("01","小一");
        map.put("02","小二");
        map.put("03","小三");
//        map.put(null,null);
        System.out.println(map);
        //1.判断是否包含某个键，返回true或false
        map.containsKey("01");
        // 2. 移除某个键，如果键不存在，返回null;存在,则返回键所对应的值
        map.remove("02");
        // 3. 返回所有键的值：map.values();
        map.values();
        // 4. 返回所有的键
        Set<String> set = map.keySet();
        Iterator<String> ss = set.iterator();
        while (ss.hasNext()) {
            String str = ss.next();
        }
        for (String str:set){
            System.out.println(str+"...."+map.get(str));
        }
    }
    /**
     * Map迭代的第二种方式
     */
    @Test
    public void  testEntrySet(){
        Map<String,String> map = new TreeMap<>();
        map.put("02","小二");
        map.put("01", "小一");
        map.put("03", "小三");

        /**
         *  Map.Entry<String,String>对象
         *
         */
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String,String> me = it.next();
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"...."+value);
        }
        System.out.println(map);
    }
    @Test
    public void nullHashMap(){
        Map<String,String> map = new HashMap<>();
        map.put("02","小二");
        map.put("01", "小一");
        map.put("03", "小三");
        map.put(null, "小空");     // HashMap允许null，作为键

        Set<String> set = map.keySet();
        Iterator<String> ss = set.iterator();
        while (ss.hasNext()) {
            String key = ss.next();
            String value = map.get(key);
            System.out.println("key= "+key+"...value="+value);
        }
    }
    @Test
    public void testHashtable(){
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("1","aa");
        hashtable.put("3","cc");
        hashtable.put("2", "bb");
        System.out.println("hashtable="+hashtable);
        Enumeration<String> ele = hashtable.keys();    // 返回所有的键
        while (ele.hasMoreElements()){
            String key = ele.nextElement();
            String value = hashtable.get(key);
            System.out.println("...key="+ key + "...value="+value);
        }


    }
}
