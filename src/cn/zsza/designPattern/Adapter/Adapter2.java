package cn.zsza.designPattern.Adapter;

/**
 * Created by zhangsong on 2016/4/3.
 */
public class Adapter2 extends Adapter1 implements Interface_one {
    @Override
    public void bb() {
        System.out.println("适配器2在继承适配器1时，只实现接口中的bb()方法");
    }
}
