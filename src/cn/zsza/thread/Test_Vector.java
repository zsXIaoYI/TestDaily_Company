package cn.zsza.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by user on 2016/2/2.
 */
class VectorSource implements Runnable{
    private Vector<String> ve = new Vector<>();
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Vector<String> getVe() {
        return ve;
    }

    public void setVe(Vector<String> ve) {
        this.ve = ve;
    }


    @Override
    public void run() {
        for (int i = 0; i < 50 ; i++) {
//            System.out.println("..."+Thread.currentThread().getName());
            ve.add(i + Thread.currentThread().getName());
//            list.add(i);
        }
    }
}
public class Test_Vector {
    public static void main(String[] args) {
        VectorSource ve = new VectorSource();

        Thread t1 = new Thread(ve,"小一");
        Thread t2 = new Thread(ve,"小二");

        t1.start();
        t2.start();
        System.out.println(ve.getVe());
//        System.out.println(ve.getList());
//        Vector<String> vector = new Vector<>();
//        vector.add("a");
//        vector.add("b");
//        vector.add("d");
//        vector.add("c");
//
//        Iterator<String> it = vector.iterator();
//        while (it.hasNext()){
//            String obj = it.next();
//            if ("b".equals(obj)){
////                it.remove();
//                vector.remove(obj);
//            }
//            System.out.println("obj="+obj);
//        }
//
//        System.out.println("vector="+vector);
    }
}
