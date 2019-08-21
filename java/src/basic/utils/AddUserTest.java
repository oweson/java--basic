package basic.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/21 19:39
 */
public class AddUserTest {
    public static final void demo1(){
        List<User> list = new ArrayList<>();
        User user;
        for (int i = 0; i < 100; i++) {
            user=new User(21+i,"ppx");
            list.add(user);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
    public static void main(String[] args) {
        demo1();
    }

}
