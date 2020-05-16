package basic.lake;

import basic.utils.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ForeachTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User(i, UUID.randomUUID().toString());
            userList.add(user);

        }
        userList.forEach(user -> {
            list.add(user.getAge());
        });
        System.out.println(list);
    }
}
