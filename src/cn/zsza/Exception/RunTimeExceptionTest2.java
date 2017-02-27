package cn.zsza.Exception;

/**
 * Created by user on 2015/12/23.
 */
public class RunTimeExceptionTest2 {
    public static void main(String[] args) {
        try {
            int a = 1 / 1;
            int arr[] = {1,2,3};
            System.out.println("a="+arr[4]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }

    }
}
