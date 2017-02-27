package cn.zsza.designPattern.Proxy;

/**
 * Created by user on 2016/4/12.
 */
public class PersonServiceBean implements PersonService {
    private String user;

    public String getUser() {
        return user;
    }

    public PersonServiceBean() {
    }
    public PersonServiceBean(String user) {
        this.user = user;
    }
    @Override
    public void add(String name) {
        System.out.println("增加方法");
    }
    @Override
    public void update(String name, Integer personId) {

    }
}
